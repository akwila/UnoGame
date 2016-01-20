
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateGame")
public class CreateGame extends HttpServlet {

    @Inject
    private Game game;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String roomName = request.getParameter("roomName");
        int maxPlayer = Integer.valueOf(request.getParameter("maxPlayer"));
        int roundLimit = Integer.valueOf(request.getParameter("roundLimit"));
        game.setGameId(roomName);
        game.setMaxPlayer(maxPlayer);
        game.setRoundLimit(roundLimit);
        
        System.out.println(game);
        request.getRequestDispatcher("UnoGame.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
