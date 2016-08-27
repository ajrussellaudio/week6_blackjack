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

}