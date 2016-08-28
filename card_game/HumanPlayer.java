package card_game;

import java.util.Scanner;
import java.util.*;

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
    ArrayList<String> twistCommands = twistCommands();
    String input = userInput.next();
    if( twistCommands.contains(input.toLowerCase()) ) return true;
    return false;
  }

  private ArrayList<String> twistCommands() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("twist");
    list.add("tw");
    list.add("t");
    list.add("hit");
    list.add("hit me");
    return list;
  }

}