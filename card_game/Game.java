// init deck
// shuffle deck
// init players (array with dealer last)
// (bet)
// deal cards
// check if any players have blackjack (pay out)
// player turns
// check if dealer has blackjack
// dealer turn
// compare totals (each player to dealer)
// go to (bet) (start draw)

package card_game;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

  private Deck deck;
  private ArrayList<Player> players = new ArrayList<Player>();
  Scanner userInput = new Scanner(System.in);

  public Game() {
    this.deck = initDeck();
    // initPlayers();
  }

  public void initPlayers(int numPlayers) {
    if(numPlayers == 0){
      numPlayers = getNumOfPlayers();
    }
    for(int i = 0; i < numPlayers; i++){
      this.players.add(new HumanPlayer());
    }
    this.players.add(new Dealer());
  }

  // private

  private Deck initDeck() {    
    Deck newDeck = new Deck();
    newDeck.fullDeck();
    return newDeck;
  }

  private int getNumOfPlayers() { // for live 
    System.out.println("\nHow many players?");
    int numPlayers = Integer.parseInt(userInput.next());
    return numPlayers;
  }

  // for tests 

  public Deck deck() { // for testing
    return deck;
  }

  public ArrayList players() {
    return players;
  }

}
