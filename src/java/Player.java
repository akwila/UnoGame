import java.io.Serializable;
import java.util.HashMap;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Player implements Serializable {

    private String PlayerId;
    private String PlayerName;
    private HashMap<Card, Boolean> HandCards;
    private int TotalScore;

    public Player(String PlayerId, String PlayerName) {
        this.PlayerId = PlayerId;
        this.PlayerName = PlayerName;
        this.HandCards = new HashMap<>();
        this.TotalScore = 0;
    }

    public Player() {
        this.PlayerId = "";
        this.PlayerName = "";
        this.HandCards = new HashMap<>();
        this.TotalScore = 0;
    }

    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getPlayerId() {
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

    @Override
    public String toString() {
        String st = "Player Id : " + this.PlayerId
                + "; Planer Name : " + this.PlayerName
                + "; Card : ";
        for (Card cd : HandCards.keySet()) {
            st += cd.getCardId() + " ";
        }
        return st;
    }

    public void Uno(Player p) {
        //???? Let think this one later
    }

    public void Uno() {
        //???? Let think this one later
    }
    
    public Player copy(){
        Player p = new Player();
        p.PlayerId=PlayerId;
        p.PlayerName= PlayerName;
        p.TotalScore = TotalScore;
        p.HandCards = HandCards;
        return p;
    }
}
