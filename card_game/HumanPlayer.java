package card_game;

public class HumanPlayer extends Player {

  public HumanPlayer() {
    this.hand = super.hand;
  }

  public String showHand() {
    return "human.showHand";
    // show both cards
  }

  public void playTurn() {  
    // -- win if blackjack
    // -- stick / twist?
    // -- if twist deal new card to hand
    // -- bust if total > 21
    // -- if stick count total
  }

}