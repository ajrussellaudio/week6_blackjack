// init deck √
// shuffle deck √
// init players (array with dealer last) √
// (bet)
// deal cards √
// check if any players have blackjack (pay out) √
// player turns √
// check if dealer has blackjack √
// dealer turn √
// compare totals (each player to dealer) √
// go to (bet) (start draw)

package card_game;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {

  private Deck deck;
  private ArrayList<Player> players;
  private Dealer dealer;
  Scanner userInput = new Scanner(System.in);

  public Game(int numPlayers) {
    if(numPlayers == 0){
      numPlayers = getNumOfPlayers();
    }
    initPlayers(numPlayers);
    this.deck = initDeck();
    deck.shuffle();
  }

  public void initPlayers(int numPlayers) {
    this.players = new ArrayList<Player>();
    for(int i = 0; i < numPlayers; i++){
      this.players.add(new HumanPlayer());
    }
    this.players.add(new Dealer());
    this.dealer = (Dealer)players.get(players.size() - 1);
  }

  public void dealCards() {
    for(int i = 0; i < 2; i++) {
      for(Player player : players) {
        dealCard(player);
      }
    }  
  }

  public void play() {
    System.out.println(dealer.hiddenHand());
    for(Player player : players){
      // if(player.checkBlackjack()) continue;
      while(true) {
        player.statusReport();
        if(player.getScore() > 21){ 
          System.out.println("[BUST!]");
          break; 
        }
        boolean twist = player.twist();
        if(twist == true) { dealCard(player); }
        if(twist == false) { break; }
        
      }
    }
    ArrayList<String> winList = checkWinners();
    System.out.println(winList);
  }

  public ArrayList<String> checkWinners() {
    ArrayList<String> winOrLose = new ArrayList<String>();
    for(int i = 0; i < (players.size() - 1); i++){
      Player player = players.get(i);
      winOrLose.add(checkWinStatus(player, dealer));
    }
    return winOrLose;
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

  private void dealCard(Player player) {
    player.hand.receiveACard(deck.dealACard());
  }

  private String checkWinStatus(Player player, Player dealer) {    
    if(dealer.getScore() > 21) { return "win"; }
    if(player.getScore() > 21) { return "lose"; }
    if(player.getScore() > dealer.getScore()) { return "win"; }
    if(player.getScore() == dealer.getScore()) { return "draw"; }
    if(player.getScore() < dealer.getScore()) { return "lose"; }
    return null;  
  }

  // for tests 

  public Deck deck() { // for testing
    return deck;
  }

  public ArrayList<Player> players() {
    return players;
  }

}
