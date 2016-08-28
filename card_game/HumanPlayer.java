package card_game;

public class HumanPlayer extends Player {

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
    return true;
  }

  private void statusReport() {
    System.out.println(showHand());
    System.out.println(showScore());
  }

}