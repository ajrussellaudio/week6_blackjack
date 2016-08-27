import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {

  Game game;

  @Before
  public void before() {
    this.game = new Game();
  }

  @Test
  public void has52CardDeck() {
    Deck deck = this.game.deck();
    assertEquals(52, deck.getCount());
  }

  @Test
  public void canInitPlayers() {
    int numPlayers = 6;
    game.initPlayers(numPlayers);
    assertEquals( 7, game.players().size() ); // 6 + 1 Dealer
  }

}