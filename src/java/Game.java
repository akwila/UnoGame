/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is the representative of a game
*
* Version Control :
* 1. 13/01/2015; Akwila; Create Game Class
* 
*/

import java.util.ArrayList;

public class Game {

    private final String GameId;
    private ArrayList<Player> PlayerList;
    private ArrayList<Round> RoundList;
    private Boolean openGame;
    /*
    * openGame True : someone can join
    * openGame False : no one can join
    */

    private final int roundLimit;
    private final int scoreLimit;
    private final int maxPlayer;
    /*
    * roundLimit = 0, that means we use score as limit
    * scoreLimit = 0, that means we use round as limit
    * if we use round as limit, minimum limit is 1
    * if we use score as limit, minumum score is 10
    */

    public Game(String GameId, int roundLimit, int scoreLimit, int maxPlayer) {
        this.GameId = GameId;
        this.PlayerList = new ArrayList<>();
        this.RoundList = new ArrayList<>();
        this.roundLimit = roundLimit;
        this.scoreLimit = scoreLimit;
        this.maxPlayer = maxPlayer;
        this.openGame = true;
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

    public int getScoreLimit() {
        return scoreLimit;
    }

    public int addPlayer(Player pl) {
        PlayerList.add(pl);
        if(PlayerList.size() == maxPlayer)
        {
            startGame();
            return 1;
            // return 1 means lets start the game
        }
        return 0;
        // return 0, means need more player
    }
    
    public void startGame(){
        this.openGame = false;
        createNewRound();
    }
    
    public Round createNewRound(){
        if(this.roundLimit > 0){
            // we use roundLimit as limit
            if(this.RoundList.size() < roundLimit){
                int newRoundId = this.RoundList.size()+1;
                return new Round(newRoundId, PlayerList);
            }
        } else {
            // we use scoreLimit as limit
            int maxScore = 0;
            for(Player p:this.PlayerList)
            {
                if(maxScore < p.getTotalScore())
                    maxScore = p.getTotalScore();
            }
            if(maxScore < scoreLimit){
                int newRoundId = this.RoundList.size()+1;
                return new Round(newRoundId, PlayerList);
            }
        }
        return null;
    }
    
    public void gameEndProcess(){
        // I am still not know what I should put in this function
    }
}
