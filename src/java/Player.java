/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is to save player information that participate in game
*
* Version Control :
* 1. 12/01/2015; Akwila; Create Player Class
* 
*/

import java.util.HashMap;

public class Player {

    private final int PlayerId;
    private final String PlayerName;
    private HashMap<Card, Boolean> HandCards;
    // if hash map doesnt word, another solution is double arraylist
    private int TotalScore;

    public Player(int PlayerId, String PlayerName) {
        this.PlayerId = PlayerId;
        this.PlayerName = PlayerName;
        this.HandCards = new HashMap<>();
        this.TotalScore = 0;
    }

    public int getPlayerId() {
        return PlayerId;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public HashMap<Card, Boolean> getHandCards() {
        return HandCards;
    }

    public int getTotalScore() {
        return TotalScore;
    }

    public void drawCard(int number, CardDeck cd) {
        switch (number) {
            case 1:
                Card temp1 = cd.drawOneCard();
                HandCards.put(temp1, Boolean.FALSE);
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    Card temp2 = cd.drawOneCard();
                    HandCards.put(temp2, Boolean.FALSE);
                }
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    Card temp4 = cd.drawOneCard();
                    HandCards.put(temp4, Boolean.FALSE);
                }
                break;
            case 7:
                for (int i = 0; i < 7; i++) {
                    Card temp7 = cd.drawOneCard();
                    HandCards.put(temp7, Boolean.FALSE);
                }
                break;
        }
    }

    public Card putOne(Card c) {
        this.HandCards.remove(c);
        return c;
    }

    public void addScore(int score) {
        this.TotalScore += score;
    }

    public void Uno(Player p) {
        //???? Let think this one later
    }

    public void Uno() {
        //???? Let think this one later
    }
}
