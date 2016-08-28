package card_game;

public abstract class Player {

  public Hand hand = new Hand();

  public abstract String showHand();
  public abstract void playTurn();

  public Hand hand() {
    return this.hand;
  }

  public boolean checkBlackjack() {
    if(hand.getCount() == 2 | hand.getTotalValue() == 21){
      return true;
    }
    return false;
  }

  public int getScore() {
    return hand.getTotalValue();
  }

}