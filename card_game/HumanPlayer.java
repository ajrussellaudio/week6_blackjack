package card_game;

import java.util.Scanner;

public class HumanPlayer extends Player {

  Scanner userInput = new Scanner(System.in);

  public HumanPlayer() {
    this.hand = super.hand;
  }

  public String showHand() {
    String output = "Your hand is: " + hand.getNamesOfCards();
    return output;
  }

  public String showScore() {
    String output = "Your score is: " + getScore();
    return output;
  }

  public boolean twist() {
    System.out.println("\nStick or twist?");
    String input = userInput.next();
    if(input.equals("twist")) return true;
    return false;
  }

}