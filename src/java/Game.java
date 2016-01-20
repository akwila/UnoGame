/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is the representative of a game
*
* Version Control :
* 1. 13/01/2015; Akwila; Create Game Class
* 
 */

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("game")
@SessionScoped
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private String GameId;
    private ArrayList<Player> PlayerList;
    private ArrayList<Round> RoundList;
    private Boolean openGame;
    /*
    * openGame True : someone can join
    * openGame False : no one can join
     */

    private int roundLimit;
    private int maxPlayer;

    /*
    * roundLimit = 0, that means we use score as limit
    * scoreLimit = 0, that means we use round as limit
    * if we use round as limit, minimum limit is 1
    * if we use score as limit, minumum score is 10
     */
    public Game(String GameId, int roundLimit, int maxPlayer) {
        this.GameId = GameId;
        this.PlayerList = new ArrayList<>();
        this.RoundList = new ArrayList<>();
        this.roundLimit = roundLimit;
        this.maxPlayer = maxPlayer;
        this.openGame = true;
    }
    
    public Game() {
        this.GameId = "";
        this.PlayerList = new ArrayList<>();
        this.RoundList = new ArrayList<>();
        this.roundLimit = 0;
        this.maxPlayer = 0;
        this.openGame = true;
    }

    public ArrayList<Round> getRoundList() {
        return RoundList;
    }

    public Boolean getOpenGame() {
        return openGame;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    public void setOpenGame(Boolean openGame) {
        this.openGame = openGame;
    }

    public void setRoundLimit(int roundLimit) {
        this.roundLimit = roundLimit;
    }

    public void setMaxPlayer(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    

    public String getGameId() {
        return GameId;
    }

    public ArrayList<Player> getPlayerList() {
        return PlayerList;
    }

    public int getRoundLimit() {
        return roundLimit;
    }

    public int addPlayer(Player pl) {
        PlayerList.add(pl);
        if (PlayerList.size() == maxPlayer) {
            startGame();
            return 1;
            // return 1 means lets start the game
        }
        return 0;
        // return 0, means need more player
    }

    public void startGame() {
        this.openGame = false;
        createNewRound();
    }

    public void createNewRound() {
        if (this.RoundList.size() < roundLimit) {
            int newRoundId = this.RoundList.size() + 1;
            RoundList.add(new Round(newRoundId, PlayerList));
        }
    }

    public void gameEndProcess() {
        // I am still not know what I should put in this function
    }

    @Override
    public String toString() {
        return "Game Id : " + this.GameId
                + "; Total Player : " + this.PlayerList.size()
                + "; Total Round : " + this.RoundList.size()
                + "; Round Limit : " + this.roundLimit
                + "; Max Player : " + this.maxPlayer
                + "; Open Game : " + this.openGame;
    }

}
