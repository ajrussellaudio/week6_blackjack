package card_game;

public abstract class Player {

  protected Hand hand = new Hand();

  public abstract String showHand();
  public abstract void playTurn();

  public Hand hand() {
    return this.hand;
  }

}