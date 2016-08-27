package card_game;

public abstract class Player {

  public Hand hand = new Hand();

  public abstract String showHand();
  public abstract void playTurn();

}