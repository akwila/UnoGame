/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is to contain all UNO card
*
* Version Control :
* 1. 12/01/2015; Akwila; Create Card Class
* 2. 14/01/2015; Akwila; Change CardId
*/

public class Card {

    private final String CardId;
    private final String FrontImage;
    private final String BackImage;
    private final String Color;
    private final String SpecialAbility;
    private final int Point;
    
    /* Color Note
    * red
    * yellow
    * green
    * blue
    * black
    */
    
    /* Special Ability Note
    * nt = doesn't have special ability
    * sk = skip
    * rv = reverse
    * p2 = plus 2
    * p4 = plus 4
    * wl = Wild / change color
    */
    
    /* Point Note
    * Draw Two, Reverse, Skip = 20pt
    * Wild, Wild Draw Four = 50pt
    */

    public Card(String CardId, String FrontImage, String BackImage, String Color, String SpecialAbility, int Point) {
        this.CardId = CardId;
        this.FrontImage = FrontImage;
        this.BackImage = BackImage;
        this.Color = Color;
        this.SpecialAbility = SpecialAbility;
        this.Point = Point;
    }

    public String getCardId() {
        return CardId;
    }

    public String getFrontImage() {
        return FrontImage;
    }

    public String getBackImage() {
        return BackImage;
    }

    public String getColor() {
        return Color;
    }

    public String getSpecialAbility() {
        return SpecialAbility;
    }

    public int getPoint() {
        return Point;
    }
}
