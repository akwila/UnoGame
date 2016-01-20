
import java.io.ByteArrayInputStream;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import org.json.JSONException;
import org.json.JSONObject;

@RequestScoped
@ServerEndpoint("/player/{room}")
public class PlayerSocket {

    @Inject private GameRooms rooms;
    @Inject private Player pl;

    private Session session;

    @OnMessage
    public void message(String msg) throws JSONException {
        System.out.println(">>>> msg = " + msg);

        JsonReader reader = Json.createReader(
                new ByteArrayInputStream(msg.getBytes()));
        JsonObject json = reader.readObject();
        
        JSONObject jo = new JSONObject();
        jo.put("name", json.getString("name"));
        jo.put("message", json.getString("message"));
        jo.put("room", json.getString("room"));
        jo.put("destination", json.getString("destination"));

        String room = json.getString("room");

        //if ("give 1 card".equals(json.getString("message"))) {
        //    asdf
        //}
        System.out.println(pl);
        String msgToRoom = json.toString();
        rooms.broadcast(room, msgToRoom);
    }

    @OnOpen
    public void open(Session s, @PathParam("room") String room) {
        System.out.println(room + " >>> @OnOpen = " + s.getId());
        session = s;
        Player player = pl.copy();
        pl = player;
        System.out.println(player);
        System.out.println(pl.getPlayerId());
        rooms.addVersion1(room, session, new Player(pl.getPlayerId(), pl.getPlayerName()));
    }

    @OnClose
    public void close() {
        System.out.println(">>> @OnClose = " + session.getId());

    }
}
