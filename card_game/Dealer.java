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

  public void playTurn() {
    // -- twist if total <= 16
    // -- stick if total >= 17
    // -- bust if total > 21
    // -- if stick count total
  }

}