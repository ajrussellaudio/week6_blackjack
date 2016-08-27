package card_game;
import java.util.*;

public class Hand extends CardStack {

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = super.cardStack;
  }

  public void receiveACard(Card card){
    hand.add(card);
  }

  public int getTotalValue() {
    int total = 0;
    for (Card card : hand){
      total += card.getValue();
    }
    return total;
  }

}