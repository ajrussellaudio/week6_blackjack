package card_game;

public class Dealer extends Player {

  public Dealer() {
    this.hand = super.hand;
  }

  public String showHand() {
    String output = "Dealer's hand is: " + hand.getNamesOfCards();
    return output;
  }

  public String hiddenHand() {
    Card firstCard = hand.firstCard();
    return "Dealer has two cards, and shows the " + firstCard.getPrettyName();
  }

  public String showScore() {
    String output = "Dealer's score is: " + getScore();
    return output;
  }

  public boolean twist() {
    if(getScore() <= 16) return true;
    return false; // stand on 17
  }

}