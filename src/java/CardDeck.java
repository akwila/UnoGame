/*
* Owner : Uno Game First Team
* General Description of this Class : 
* - this class is to represent deck card
*
* Version Control :
* 1. 12/01/2015; Akwila; Create CardDeck Class
* 
*/

import java.util.ArrayList;

public class CardDeck {

    private ArrayList<Card> CardList;

    public CardDeck() {
        Card card;
        card = new Card(1, "c0_00.png", "back.png", "red", "nt", 0); CardList.add(card);
        card = new Card(2, "c0_01.png", "back.png", "red", "nt", 1); CardList.add(card);
        card = new Card(3, "c0_01.png", "back.png", "red", "nt", 1); CardList.add(card);
        card = new Card(4, "c0_02.png", "back.png", "red", "nt", 2); CardList.add(card);
        card = new Card(5, "c0_02.png", "back.png", "red", "nt", 2); CardList.add(card);
        card = new Card(6, "c0_03.png", "back.png", "red", "nt", 3); CardList.add(card);
        card = new Card(7, "c0_03.png", "back.png", "red", "nt", 3); CardList.add(card);
        card = new Card(8, "c0_04.png", "back.png", "red", "nt", 4); CardList.add(card);
        card = new Card(9, "c0_04.png", "back.png", "red", "nt", 4); CardList.add(card);
        card = new Card(10, "c0_05.png", "back.png", "red", "nt", 5); CardList.add(card);
        card = new Card(11, "c0_05.png", "back.png", "red", "nt", 5); CardList.add(card);
        card = new Card(12, "c0_06.png", "back.png", "red", "nt", 6); CardList.add(card);
        card = new Card(13, "c0_06.png", "back.png", "red", "nt", 6); CardList.add(card);
        card = new Card(14, "c0_07.png", "back.png", "red", "nt", 7); CardList.add(card);
        card = new Card(15, "c0_07.png", "back.png", "red", "nt", 7); CardList.add(card);
        card = new Card(16, "c0_08.png", "back.png", "red", "nt", 8); CardList.add(card);
        card = new Card(17, "c0_08.png", "back.png", "red", "nt", 8); CardList.add(card);
        card = new Card(18, "c0_09.png", "back.png", "red", "nt", 9); CardList.add(card);
        card = new Card(19, "c0_09.png", "back.png", "red", "nt", 9); CardList.add(card);
        card = new Card(20, "c0_10.png", "back.png", "red", "sk", 20); CardList.add(card);
        card = new Card(21, "c0_10.png", "back.png", "red", "sk", 20); CardList.add(card);
        card = new Card(22, "c0_11.png", "back.png", "red", "rv", 20); CardList.add(card);
        card = new Card(23, "c0_11.png", "back.png", "red", "rv", 20); CardList.add(card);
        card = new Card(24, "c0_12.png", "back.png", "red", "p2", 20); CardList.add(card);
        card = new Card(25, "c0_12.png", "back.png", "red", "p2", 20); CardList.add(card);
        
        card = new Card(26, "c1_00.png", "back.png", "yellow", "nt", 0); CardList.add(card);
        card = new Card(27, "c1_01.png", "back.png", "yellow", "nt", 1); CardList.add(card);
        card = new Card(28, "c1_01.png", "back.png", "yellow", "nt", 1); CardList.add(card);
        card = new Card(29, "c1_02.png", "back.png", "yellow", "nt", 2); CardList.add(card);
        card = new Card(30, "c1_02.png", "back.png", "yellow", "nt", 2); CardList.add(card);
        card = new Card(31, "c1_03.png", "back.png", "yellow", "nt", 3); CardList.add(card);
        card = new Card(32, "c1_03.png", "back.png", "yellow", "nt", 3); CardList.add(card);
        card = new Card(33, "c1_04.png", "back.png", "yellow", "nt", 4); CardList.add(card);
        card = new Card(34, "c1_04.png", "back.png", "yellow", "nt", 4); CardList.add(card);
        card = new Card(35, "c1_05.png", "back.png", "yellow", "nt", 5); CardList.add(card);
        card = new Card(36, "c1_05.png", "back.png", "yellow", "nt", 5); CardList.add(card);
        card = new Card(37, "c1_06.png", "back.png", "yellow", "nt", 6); CardList.add(card);
        card = new Card(38, "c1_06.png", "back.png", "yellow", "nt", 6); CardList.add(card);
        card = new Card(39, "c1_07.png", "back.png", "yellow", "nt", 7); CardList.add(card);
        card = new Card(40, "c1_07.png", "back.png", "yellow", "nt", 7); CardList.add(card);
        card = new Card(41, "c1_08.png", "back.png", "yellow", "nt", 8); CardList.add(card);
        card = new Card(42, "c1_08.png", "back.png", "yellow", "nt", 8); CardList.add(card);
        card = new Card(43, "c1_09.png", "back.png", "yellow", "nt", 9); CardList.add(card);
        card = new Card(44, "c1_09.png", "back.png", "yellow", "nt", 9); CardList.add(card);
        card = new Card(45, "c1_10.png", "back.png", "yellow", "sk", 20); CardList.add(card);
        card = new Card(46, "c1_10.png", "back.png", "yellow", "sk", 20); CardList.add(card);
        card = new Card(47, "c1_11.png", "back.png", "yellow", "rv", 20); CardList.add(card);
        card = new Card(48, "c1_11.png", "back.png", "yellow", "rv", 20); CardList.add(card);
        card = new Card(49, "c1_12.png", "back.png", "yellow", "p2", 20); CardList.add(card);
        card = new Card(50, "c1_12.png", "back.png", "yellow", "p2", 20); CardList.add(card);
        
        
        
        card = new Card(51, "c2_00.png", "back.png", "green", "nt", 0); CardList.add(card);
        card = new Card(52, "c2_01.png", "back.png", "green", "nt", 1); CardList.add(card);
        card = new Card(53, "c2_01.png", "back.png", "green", "nt", 1); CardList.add(card);
        card = new Card(54, "c2_02.png", "back.png", "green", "nt", 2); CardList.add(card);
        card = new Card(55, "c2_02.png", "back.png", "green", "nt", 2); CardList.add(card);
        card = new Card(56, "c2_03.png", "back.png", "green", "nt", 3); CardList.add(card);
        card = new Card(57, "c2_03.png", "back.png", "green", "nt", 3); CardList.add(card);
        card = new Card(58, "c2_04.png", "back.png", "green", "nt", 4); CardList.add(card);
        card = new Card(59, "c2_04.png", "back.png", "green", "nt", 4); CardList.add(card);
        card = new Card(60, "c2_05.png", "back.png", "green", "nt", 5); CardList.add(card);
        card = new Card(61, "c2_05.png", "back.png", "green", "nt", 5); CardList.add(card);
        card = new Card(62, "c2_06.png", "back.png", "green", "nt", 6); CardList.add(card);
        card = new Card(63, "c2_06.png", "back.png", "green", "nt", 6); CardList.add(card);
        card = new Card(64, "c2_07.png", "back.png", "green", "nt", 7); CardList.add(card);
        card = new Card(65, "c2_07.png", "back.png", "green", "nt", 7); CardList.add(card);
        card = new Card(66, "c2_08.png", "back.png", "green", "nt", 8); CardList.add(card);
        card = new Card(67, "c2_08.png", "back.png", "green", "nt", 8); CardList.add(card);
        card = new Card(68, "c2_09.png", "back.png", "green", "nt", 9); CardList.add(card);
        card = new Card(69, "c2_09.png", "back.png", "green", "nt", 9); CardList.add(card);
        card = new Card(70, "c2_10.png", "back.png", "green", "sk", 20); CardList.add(card);
        card = new Card(71, "c2_10.png", "back.png", "green", "sk", 20); CardList.add(card);
        card = new Card(72, "c2_11.png", "back.png", "green", "rv", 20); CardList.add(card);
        card = new Card(73, "c2_11.png", "back.png", "green", "rv", 20); CardList.add(card);
        card = new Card(74, "c2_12.png", "back.png", "green", "p2", 20); CardList.add(card);
        card = new Card(75, "c2_12.png", "back.png", "green", "p2", 20); CardList.add(card);
        
        card = new Card(76, "c3_00.png", "back.png", "blue", "nt", 0); CardList.add(card);
        card = new Card(77, "c3_01.png", "back.png", "blue", "nt", 1); CardList.add(card);
        card = new Card(78, "c0_01.png", "back.png", "blue", "nt", 1); CardList.add(card);
        card = new Card(79, "c3_02.png", "back.png", "blue", "nt", 2); CardList.add(card);
        card = new Card(80, "c0_02.png", "back.png", "blue", "nt", 2); CardList.add(card);
        card = new Card(81, "c3_03.png", "back.png", "blue", "nt", 3); CardList.add(card);
        card = new Card(82, "c0_03.png", "back.png", "blue", "nt", 3); CardList.add(card);
        card = new Card(83, "c3_04.png", "back.png", "blue", "nt", 4); CardList.add(card);
        card = new Card(84, "c0_04.png", "back.png", "blue", "nt", 4); CardList.add(card);
        card = new Card(85, "c3_05.png", "back.png", "blue", "nt", 5); CardList.add(card);
        card = new Card(86, "c0_05.png", "back.png", "blue", "nt", 5); CardList.add(card);
        card = new Card(87, "c3_06.png", "back.png", "blue", "nt", 6); CardList.add(card);
        card = new Card(88, "c0_06.png", "back.png", "blue", "nt", 6); CardList.add(card);
        card = new Card(89, "c3_07.png", "back.png", "blue", "nt", 7); CardList.add(card);
        card = new Card(90, "c0_07.png", "back.png", "blue", "nt", 7); CardList.add(card);
        card = new Card(91, "c3_08.png", "back.png", "blue", "nt", 8); CardList.add(card);
        card = new Card(92, "c0_08.png", "back.png", "blue", "nt", 8); CardList.add(card);
        card = new Card(93, "c3_09.png", "back.png", "blue", "nt", 9); CardList.add(card);
        card = new Card(94, "c0_09.png", "back.png", "blue", "nt", 9); CardList.add(card);
        card = new Card(95, "c3_10.png", "back.png", "blue", "sk", 20); CardList.add(card);
        card = new Card(96, "c0_10.png", "back.png", "blue", "sk", 20); CardList.add(card);
        card = new Card(97, "c3_11.png", "back.png", "blue", "rv", 20); CardList.add(card);
        card = new Card(98, "c0_11.png", "back.png", "blue", "rv", 20); CardList.add(card);
        card = new Card(99, "c3_12.png", "back.png", "blue", "p2", 20); CardList.add(card);
        card = new Card(100, "c0_12.png", "back.png", "blue", "p2", 20); CardList.add(card);
        
        card = new Card(101, "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card(102, "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card(103, "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        card = new Card(104, "c4_00.png", "back.png", "black", "wl", 50); CardList.add(card);
        
        card = new Card(105, "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card(106, "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card(107, "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
        card = new Card(108, "c4_01.png", "back.png", "black", "p4", 50); CardList.add(card);
    }
    
    public Card drawOneCard(){
        int size = this.CardList.size();
        int i = (int)(Math.random()*size); 
        Card drawCard = CardList.get(i);
        this.CardList.remove(i);
        return drawCard;
    }
}
