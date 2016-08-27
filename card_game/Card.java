package card_game;

public class Card {

  private RankType rank;
  private SuitType suit;

  public Card(RankType rank, SuitType suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public SuitType getSuit() {
    return suit;
  }  

  public RankType getRank() {
    return rank;
  }

  public String getPrettyName() {
    return ( getPrettyName(rank) + " of " + getPrettyName(suit) );
  }

  public int getValue() {
    return rank.getValue();
  }

  private String getPrettyName(Enum inputEnum) {
    if(inputEnum.name().length() == 0 | inputEnum.name() == null) return null;
    String name = inputEnum.name();
    name = name.toLowerCase();
    if(name.length() > 1) return name.substring(0, 1).toUpperCase() + name.substring(1);
    if(name.length() > 0) return name.toUpperCase();
    return null;
  }

}