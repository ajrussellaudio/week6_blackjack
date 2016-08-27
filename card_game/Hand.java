package card_game;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public void receiveACard(Card card){
    hand.add(card);
  }

  public int getCount(){
    return hand.size();
  }

  public int getTotalValue() {
    int total = 0;
    for (Card card : hand){
      total += card.getValue();
    }
    return total;
  }

}