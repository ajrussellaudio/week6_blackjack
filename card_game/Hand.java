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
    for(Card card : hand){
      total += card.getValue();
    }
    for(Card card : hand){
      if(total < 12 & card.getRank() == RankType.ACE) { total += 10; }
    }
    return total;
  }

  public String getNamesOfCards() {
    String output = "";
    for(Card card : hand) {
      output += card.getPrettyName();
      output += ", ";
    }
    output = output.substring(0, output.length() - 2);
    return output;
  }

  public Card firstCard() {
    return hand.get(0);
  }

}