
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import org.jboss.weld.context.http.HttpRequestContext;
import org.json.JSONException;
import org.json.JSONObject;

@RequestScoped
@ServerEndpoint("/game/{room}")
public class GameSocket {

    @Inject
    private GameRooms rooms;
    @Inject
    private Game gm;
    @Inject
    private CardDeck cdeck;

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

        if (jo.getString("destination").equals("deck")) {

        } else {
            if ("give 1 card".equals(json.getString("message"))) {
                //jo.remove("message");
                Card cdTake = cdeck.drawOneCard();
                jo.put("cardId", cdTake.getCardId());
                jo.put("cardPicture", cdTake.getFrontImage());
            }
            // other if here
        }
        
        System.out.print(cdeck);
        String msgToRoom = jo.toString();
        rooms.broadcast(room, msgToRoom);
    }

    @OnOpen
    public void open(Session s,
            @PathParam("room") String room
    ) {
        System.out.println(room + " >>> @OnOpen = " + s.getId());
        
        session = s;
        
        cdeck = new CardDeck();
        System.out.println(gm);
        rooms.addVersion2(room, session, new Game(gm.getGameId(), gm.getRoundLimit(), gm.getMaxPlayer()));
    }

    @OnClose
    public void close() {
        System.out.println(">>> @OnClose = " + session.getId());
    }
}
