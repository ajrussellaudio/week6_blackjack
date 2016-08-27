import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {

  Game game;

  @Before
  public void before() {
    this.game = new Game(3);
  }

  @Test
  public void has52CardDeck() {
    Deck deck = this.game.deck();
    assertEquals(52, deck.getCount());
  }

  @Test
  public void canInitPlayers() {
    assertEquals( 4, game.players().size() ); // 3 + 1 Dealer
  }

  @Test
  public void canDealCards() {
    game.dealCards();
    Player player = game.players().get(0);
    assertEquals( 2, player.hand().getCount());
  }

}