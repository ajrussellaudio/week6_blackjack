package card_game;

// import java.util.Scanner;

public class GameRunner {

  private static Game game;

  public static void main(String[] args) {
    game = new Game(0);
    game.dealCards();
    game.play();
  }

}
