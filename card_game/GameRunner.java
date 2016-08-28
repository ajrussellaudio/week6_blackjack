package card_game;

// import java.util.Scanner;
import java.util.ArrayList;
// import java.util.concurrent.TimeUnit;

public class GameRunner {

  private static Game game;

  public static void main(String[] args) {
    clearScreen();
    System.out.println("Welcome to Honest Al's Casino");
    System.out.println("How many Blackjack players?");
    game = new Game(0);
    game.dealCards();
    separator();
    play();
    reportWinners();
    System.out.println("Thanks for playing, folks. Come again!");
    System.out.println(" -- Honest Al, the Punters' Pal --");
  }

  private static void play() {
    System.out.println("[DEALER] has two cards, showing " + game.dealer.hiddenHand());
    blankLine();
    int playerCount = 0;
    for(Player player : game.players){
      boolean isDealer = (player == game.dealer);
      playerCount++;
      while(true) {
        if(isDealer == false){ System.out.print("[PLAYER " + playerCount +"]: "); }
        if(isDealer == true){ System.out.print("[DEALER]: "); }
        player.statusReport();
        if(player.getScore() > 21) { System.out.println("[BUST!]"); }
        if(player.checkBlackjack() == true){ System.out.println("[BLACKJACK!]"); }
        if(player.getScore() >= 21){ break; }
        if(isDealer == false) {System.out.println("Stick or twist?");}
        boolean twist = player.twist();
        if(twist == false) { break; }     
        if(twist == true) { game.dealCard(player); }
        // blankLine();
        if(isDealer == true) { pause(); }
      }
      separator();
    }
  }

  private static void reportWinners() {
    ArrayList<String> winList = game.checkWinners();
    for(int i = 0; i < winList.size(); i++){
      System.out.println("Player " + (i + 1) + " " + winList.get(i) + "s.");
      pause();
    }
    separator();
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

  private static void separator() {
    blankLine();
    System.out.println("[==========]");
    blankLine();
  }

  private static void blankLine() {
    System.out.println("");
  }

}
