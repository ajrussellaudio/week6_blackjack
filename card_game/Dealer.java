package card_game;

public class Dealer extends Player {

  public Dealer() {
    this.hand = super.hand;
  }

  public String showHand() {
    return "dealer.showHand";
    // show first card
    // hide second card until all players have played
  }

  public boolean twist() {
    return true;
  }

}