
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.enterprise.context.ApplicationScoped;
import javax.websocket.Session;

@ApplicationScoped
public class GameRooms {

    private Map<String, Game> room = new HashMap<>();
    private Map<Game, List<Session>> rooms = new HashMap<>();
    private Lock lock = new ReentrantLock();

    public Map<String, Game> getRoom() {
        return room;
    }

    public void addVersion1(String roomName, Session session, Player pls) {
        // this is for player join, I need to check before assign player
        // under assumtion that game is already created
        lock.lock();
        try {
            Game GameInRoom = room.get(roomName);
            GameInRoom.addPlayer(pls);
            List<Session> sessions = rooms.get(GameInRoom);
            if (null == sessions) {
                sessions = new LinkedList<>();
                rooms.put(GameInRoom, sessions);
            }
            sessions.add(session);

        } finally {
            lock.unlock();
        }
    }

    public void addVersion2(String roomName, Session session, Game gm) {
        lock.lock();
        try {
            Game gamesInSpecRoom = room.get(roomName);
            if (null == gamesInSpecRoom) {
                room.put(roomName, gm);
                
                Game gamesInRoom = room.get(roomName);
                List<Session> sessions = rooms.get(gamesInRoom);
                if (null == sessions) {
                    sessions = new LinkedList<>();
                    rooms.put(gamesInRoom, sessions);
                }
                sessions.add(session);
            } else {
                List<Session> sessions = rooms.get(gamesInSpecRoom);
                if (null == sessions) {
                    sessions = new LinkedList<>();
                    rooms.put(gm, sessions);
                }
                sessions.add(session);
            }
        } finally {
            lock.unlock();
        }
    }

    public Set<Game> roomNames() {
        lock.lock();
        try {
            return (rooms.keySet());
        } finally {
            lock.unlock();
        }
    }

    public void broadcast(String roomName, String msgToRoom) {
        lock.lock();
        try {
            Game game = room.get(roomName);
            List<Session> sessions = rooms.get(game);
            System.out.println(game);
            if (null == sessions) {
                return;
            }

            for (Session s : sessions) {
                try {
                    s.getBasicRemote().sendText(msgToRoom);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
