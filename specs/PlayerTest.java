import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  HumanPlayer human;
  Dealer dealer;

  @Before
  public void before() {
    this.human = new HumanPlayer();
    this.dealer = new Dealer();
  }

  @Test
  public void canShowHand() {
    assertEquals("human.showHand", human.showHand());
  }

  @Test
  public void canCheckBlackJack() {
    human.hand.receiveACard(new Card(RankType.ACE, SuitType.SPADES));
    human.hand.receiveACard(new Card(RankType.JACK, SuitType.CLUBS));
    assertEquals( true, human.checkBlackjack() );
  }

  @Test
  public void canCheckBlackJack_false() {
    human.hand.receiveACard(new Card(RankType.KING, SuitType.SPADES));
    human.hand.receiveACard(new Card(RankType.JACK, SuitType.CLUBS));
    assertEquals( true, human.checkBlackjack() );
  }

}