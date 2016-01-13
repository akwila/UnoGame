/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is the representative of one round
*
* Version Control :
* 1. 13/01/2015; Akwila; Create Round Class
* 
*/

import java.util.ArrayList;
import java.util.Set;

public class Round {

    private final int RoundId;
    private final ArrayList<Player> PlayerList;
    private Player Winner;
    private int Score;
    CardDeck CardInDeck;

    public Round(int RoundId, ArrayList<Player> PlayerList) {
        this.RoundId = RoundId;
        this.PlayerList = PlayerList; // I hope it worked
        this.Winner = null;
        this.Score = 0;
        CardInDeck = new CardDeck();
    }

    public void roundEndProcess() {
        int minScore = Integer.MAX_VALUE;

        for (Player pl : PlayerList) {
            Set<Card> card = pl.getHandCards().keySet();
            int tempTotalScore = 0;
            for (Card cd : card) {
                tempTotalScore += cd.getPoint();
            }
            if (minScore > tempTotalScore) {
                minScore = tempTotalScore;
                this.Winner = pl;
            }
            this.Score += tempTotalScore;
        }
        
        // the case if winner doesn't have card and one other player have 1 zero card, we need to change it
        this.Winner.addScore(this.Score);
    }
}
