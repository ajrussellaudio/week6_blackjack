import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest {

  Hand hand;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  
  @Before 
  public void before(){
    hand = new Hand();
    card1 = new Card(RankType.THREE, SuitType.CLUBS);
    card2 = new Card(RankType.KING, SuitType.SPADES);
    card3 = new Card(RankType.NINE, SuitType.HEARTS);
    card4 = new Card(RankType.SEVEN, SuitType.DIAMONDS);
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(hand.getCount(), 0);
  }

  @Test
  public void canReceiveACard(){
    hand.receiveACard(card1);
    assertEquals(hand.getCount(), 1);
  }

  @Test
  public void canGetTotalValue() {
    hand.receiveACard(card2);
    hand.receiveACard(card3);
    hand.receiveACard(card4);
    assertEquals(26, hand.getTotalValue());
  }

  @Test
  public void canGetNamesOfCards() {
    hand.receiveACard(card2);
    hand.receiveACard(card3);
    hand.receiveACard(card4);
    assertEquals("King of Spades, Nine of Hearts, Seven of Diamonds", hand.getNamesOfCards());
  }

}