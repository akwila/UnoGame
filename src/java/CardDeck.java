/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is to represent deck card
*
* Version Control :
* 1. 12/01/2015; Akwila; Create CardDeck Class
* 2. 14/01/2015; Akwila; Change CardId
*/

import java.util.ArrayList;

public class CardDeck {

    private ArrayList<Card> CardList;

    public CardDeck() {
        Card card;
        card = new Card("r001", "c0_00.png", "back.png", "red", "nt", 0); CardList.add(card);
        card = new Card("r011", "c0_01.png", "back.png", "red", "nt", 1); CardList.add(card);
        card = new Card("r012", "c0_01.png", "back.png", "red", "nt", 1); CardList.add(card);
        card = new Card("r021", "c0_02.png", "back.png", "red", "nt", 2); CardList.add(card);
        card = new Card("r022", "c0_02.png", "back.png", "red", "nt", 2); CardList.add(card);
        card = new Card("r031", "c0_03.png", "back.png", "red", "nt", 3); CardList.add(card);
        card = new Card("r032", "c0_03.png", "back.png", "red", "nt", 3); CardList.add(card);
        card = new Card("r041", "c0_04.png", "back.png", "red", "nt", 4); CardList.add(card);
        card = new Card("r042", "c0_04.png", "back.png", "red", "nt", 4); CardList.add(card);
        card = new Card("r051", "c0_05.png", "back.png", "red", "nt", 5); CardList.add(card);
        card = new Card("r052", "c0_05.png", "back.png", "red", "nt", 5); CardList.add(card);
        card = new Card("r061", "c0_06.png", "back.png", "red", "nt", 6); CardList.add(card);
        card = new Card("r062", "c0_06.png", "back.png", "red", "nt", 6); CardList.add(card);
        card = new Card("r071", "c0_07.png", "back.png", "red", "nt", 7); CardList.add(card);
        card = new Card("r072", "c0_07.png", "back.png", "red", "nt", 7); CardList.add(card);
        card = new Card("r081", "c0_08.png", "back.png", "red", "nt", 8); CardList.add(card);
        card = new Card("r082", "c0_08.png", "back.png", "red", "nt", 8); CardList.add(card);
        card = new Card("r091", "c0_09.png", "back.png", "red", "nt", 9); CardList.add(card);
        card = new Card("r092", "c0_09.png", "back.png", "red", "nt", 9); CardList.add(card);
        card = new Card("r101", "c0_10.png", "back.png", "red", "sk", 20); CardList.add(card);
        card = new Card("r102", "c0_10.png", "back.png", "red", "sk", 20); CardList.add(card);
        card = new Card("r111", "c0_11.png", "back.png", "red", "rv", 20); CardList.add(card);
        card = new Card("r112", "c0_11.png", "back.png", "red", "rv", 20); CardList.add(card);
        card = new Card("r121", "c0_12.png", "back.png", "red", "p2", 20); CardList.add(card);
        card = new Card("r122", "c0_12.png", "back.png", "red", "p2", 20); CardList.add(card);
        
        card = new Card("y001", "c1_00.png", "back.png", "yellow", "nt", 0); CardList.add(card);
        card = new Card("y011", "c1_01.png", "back.png", "yellow", "nt", 1); CardList.add(card);
        card = new Card("y012", "c1_01.png", "back.png", "yellow", "nt", 1); CardList.add(card);
        card = new Card("y021", "c1_02.png", "back.png", "yellow", "nt", 2); CardList.add(card);
        card = new Card("y022", "c1_02.png", "back.png", "yellow", "nt", 2); CardList.add(card);
        card = new Card("y031", "c1_03.png", "back.png", "yellow", "nt", 3); CardList.add(card);
        card = new Card("y032", "c1_03.png", "back.png", "yellow", "nt", 3); CardList.add(card);
        card = new Card("y041", "c1_04.png", "back.png", "yellow", "nt", 4); CardList.add(card);
        card = new Card("y042", "c1_04.png", "back.png", "yellow", "nt", 4); CardList.add(card);
        card = new Card("y051", "c1_05.png", "back.png", "yellow", "nt", 5); CardList.add(card);
        card = new Card("y052", "c1_05.png", "back.png", "yellow", "nt", 5); CardList.add(card);
        card = new Card("y061", "c1_06.png", "back.png", "yellow", "nt", 6); CardList.add(card);
        card = new Card("y062", "c1_06.png", "back.png", "yellow", "nt", 6); CardList.add(card);
        card = new Card("y071", "c1_07.png", "back.png", "yellow", "nt", 7); CardList.add(card);
        card = new Card("y072", "c1_07.png", "back.png", "yellow", "nt", 7); CardList.add(card);
        card = new Card("y081", "c1_08.png", "back.png", "yellow", "nt", 8); CardList.add(card);
        card = new Card("y082", "c1_08.png", "back.png", "yellow", "nt", 8); CardList.add(card);
        card = new Card("y091", "c1_09.png", "back.png", "yellow", "nt", 9); CardList.add(card);
        card = new Card("y092", "c1_09.png", "back.png", "yellow", "nt", 9); CardList.add(card);
        card = new Card("y101", "c1_10.png", "back.png", "yellow", "sk", 20); CardList.add(card);
        card = new Card("y102", "c1_10.png", "back.png", "yellow", "sk", 20); CardList.add(card);
        card = new Card("y111", "c1_11.png", "back.png", "yellow", "rv", 20); CardList.add(card);
        card = new Card("y112", "c1_11.png", "back.png", "yellow", "rv", 20); CardList.add(card);
        card = new Card("y121", "c1_12.png", "back.png", "yellow", "p2", 20); CardList.add(card);
        card = new Card("y122", "c1_12.png", "back.png", "yellow", "p2", 20); CardList.add(card);
        
        
        
        card = new Card("g001", "c2_00.png", "back.png", "green", "nt", 0); CardList.add(card);
        card = new Card("g011", "c2_01.png", "back.png", "green", "nt", 1); CardList.add(card);
        card = new Card("g012", "c2_01.png", "back.png", "green", "nt", 1); CardList.add(card);
        card = new Card("g021", "c2_02.png", "back.png", "green", "nt", 2); CardList.add(card);
        card = new Card("g022", "c2_02.png", "back.png", "green", "nt", 2); CardList.add(card);
        card = new Card("g031", "c2_03.png", "back.png", "green", "nt", 3); CardList.add(card);
        card = new Card("g032", "c2_03.png", "back.png", "green", "nt", 3); CardList.add(card);
        card = new Card("g041", "c2_04.png", "back.png", "green", "nt", 4); CardList.add(card);
        card = new Card("g042", "c2_04.png", "back.png", "green", "nt", 4); CardList.add(card);
        card = new Card("g051", "c2_05.png", "back.png", "green", "nt", 5); CardList.add(card);
        card = new Card("g052", "c2_05.png", "back.png", "green", "nt", 5); CardList.add(card);
        card = new Card("g061", "c2_06.png", "back.png", "green", "nt", 6); CardList.add(card);
        card = new Card("g062", "c2_06.png", "back.png", "green", "nt", 6); CardList.add(card);
        card = new Card("g071", "c2_07.png", "back.png", "green", "nt", 7); CardList.add(card);
        card = new Card("g072", "c2_07.png", "back.png", "green", "nt", 7); CardList.add(card);
        card = new Card("g081", "c2_08.png", "back.png", "green", "nt", 8); CardList.add(card);
        card = new Card("g082", "c2_08.png", "back.png", "green", "nt", 8); CardList.add(card);
        card = new Card("g091", "c2_09.png", "back.png", "green", "nt", 9); CardList.add(card);
        card = new Card("g092", "c2_09.png", "back.png", "green", "nt", 9); CardList.add(card);
        card = new Card("g101", "c2_10.png", "back.png", "green", "sk", 20); CardList.add(card);
        card = new Card("g102", "c2_10.png", "back.png", "green", "sk", 20); CardList.add(card);
        card = new Card("g111", "c2_11.png", "back.png", "green", "rv", 20); CardList.add(card);
        card = new Card("g112", "c2_11.png", "back.png", "green", "rv", 20); CardList.add(card);
        card = new Card("g121", "c2_12.png", "back.png", "green", "p2", 20); CardList.add(card);
        card = new Card("g122", "c2_12.png", "back.png", "green", "p2", 20); CardList.add(card);
        
        card = new Card("b001", "c3_00.png", "back.png", "blue", "nt", 0); CardList.add(card);
        card = new Card("b011", "c3_01.png", "back.png", "blue", "nt", 1); CardList.add(card);
        card = new Card("b012", "c0_01.png", "back.png", "blue", "nt", 1); CardList.add(card);
        card = new Card("b021", "c3_02.png", "back.png", "blue", "nt", 2); CardList.add(card);
        card = new Card("b022", "c0_02.png", "back.png", "blue", "nt", 2); CardList.add(card);
        card = new Card("b031", "c3_03.png", "back.png", "blue", "nt", 3); CardList.add(card);
        card = new Card("b032", "c0_03.png", "back.png", "blue", "nt", 3); CardList.add(card);
        card = new Card("b041", "c3_04.png", "back.png", "blue", "nt", 4); CardList.add(card);
        card = new Card("b042", "c0_04.png", "back.png", "blue", "nt", 4); CardList.add(card);
        card = new Card("b051", "c3_05.png", "back.png", "blue", "nt", 5); CardList.add(card);
        card = new Card("b052", "c0_05.png", "back.png", "blue", "nt", 5); CardList.add(card);
        card = new Card("b061", "c3_06.png", "back.png", "blue", "nt", 6); CardList.add(card);
        card = new Card("b062", "c0_06.png", "back.png", "blue", "nt", 6); CardList.add(card);
        card = new Card("b071", "c3_07.png", "back.png", "blue", "nt", 7); CardList.add(card);
        card = new Card("b072", "c0_07.png", "back.png", "blue", "nt", 7); CardList.add(card);
        card = new Card("b081", "c3_08.png", "back.png", "blue", "nt", 8); CardList.add(card);
        card = new Card("b082", "c0_08.png", "back.png", "blue", "nt", 8); CardList.add(card);
        card = new Card("b091", "c3_09.png", "back.png", "blue", "nt", 9); CardList.add(card);
        card = new Card("b092", "c0_09.png", "back.png", "blue", "nt", 9); CardList.add(card);
        card = new Card("b101", "c3_10.png", "back.png", "blue", "sk", 20); CardList.add(card);
        card = new Card("b102", "c0_10.png", "back.png", "blue", "sk", 20); CardList.add(card);
        card = new Card("b111", "c3_11.png", "back.png", "blue", "rv", 20); CardList.add(card);
        card = new Card("b112", "c0_11.png", "back.png", "blue", "rv", 20); CardList.add(card);
        card = new Card("b121", "c3_12.png", "back.png", "blue", "p2", 20); CardList.add(card);
        card = new Card("b122", "c0_12.png", "back.png", "blue", "p2", 20); CardList.add(card);
        
        card = new Card("k001", "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card("k002", "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card("k003", "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card("k004", "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        
        card = new Card("k011", "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card("k012", "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card("k013", "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card("k014", "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
    }
    
    public Card drawOneCard(){
        int size = this.CardList.size();
        int i = (int)(Math.random()*size); 
        Card drawCard = CardList.get(i);
        this.CardList.remove(i);
        return drawCard;
    }
}
