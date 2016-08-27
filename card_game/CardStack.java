package card_game;
import java.util.*;

public abstract class CardStack {

  protected ArrayList<Card> cardStack = new ArrayList<Card>();

  public int getCount(){
      return cardStack.size();
  }

} 