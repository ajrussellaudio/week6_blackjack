package card_game;

public abstract class Player {

  public Hand hand = new Hand();

  public abstract String showHand();
  public abstract String showScore();
  public abstract boolean twist();

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

  public void statusReport() {
    System.out.println(showHand());
    System.out.println(showScore());
  }

}