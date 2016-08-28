package card_game;

// import java.util.Scanner;
import java.util.ArrayList;
// import java.util.concurrent.TimeUnit;

public class GameRunner {

  private static Game game;

  public static void main(String[] args) {
    clearScreen();
    System.out.println("How many players?");
    game = new Game(0);
    game.dealCards();
    clearScreen();
    play();
    reportWinners();
  }

  private static void play() {
    System.out.println(game.dealer.hiddenHand());
    int playerCount = 0;
    for(Player player : game.players){
      boolean isDealer = (player == game.dealer);
      playerCount++;
      while(true) {
        if(isDealer == false){System.out.print("[PLAYER " + playerCount +"]: ");}
        player.statusReport();
        if(player.getScore() > 21) { System.out.println("[BUST!]\n"); }
        if(player.checkBlackjack() == true){ System.out.println("[BLACKJACK!]\n"); }
        if(player.getScore() >= 21){ break; }

        if(isDealer == false) {System.out.println("Stick or twist?");}
        boolean twist = player.twist();
        if(isDealer == true) { pause(); }
        System.out.println("\n");
        if(twist == true) { game.dealCard(player); }
        if(twist == false) { break; }     
      }
    }
  }

  private static void reportWinners() {
    ArrayList<String> winList = game.checkWinners();
    for(int i = 0; i < winList.size(); i++){
      System.out.println("Player " + (i + 1) + " " + winList.get(i) + "s.");
    }
  }

  private static void clearScreen() {
    // lifted from Stack Overflow
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  private static void pause() {
    // lifted from Stack Overflow
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
  }

}
