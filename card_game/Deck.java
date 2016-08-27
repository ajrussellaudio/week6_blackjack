package card_game;
import java.util.*;

public class Deck extends CardStack {

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = super.cardStack;
  }

  public void fullDeck(){
    for(SuitType suit : SuitType.values()){
      for(RankType rank : RankType.values()){
        deck.add(new Card(rank, suit));
      }
    }
  }

  public Card dealACard(){
    Card card = deck.remove(0);
    return card;
  }

  public void shuffle() {
    Collections.shuffle(this.deck); 
  }

}