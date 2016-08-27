package card_game;

public class HumanPlayer extends Player {

  public HumanPlayer() {
    this.hand = super.hand;
  }

  public String showHand() {
    return "human.showHand";
  }

}