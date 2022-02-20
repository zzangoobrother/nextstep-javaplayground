package com.example.nextstepjavaplayground.blackjack1;

public class Card {

  private final Suit suit;
  private final Denomination denomination;

  public Card(Suit suit, Denomination denomination) {
    this.suit = suit;
    this.denomination = denomination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Card card = (Card) o;

    if (suit != card.suit) {
      return false;
    }
    return denomination == card.denomination;
  }

  @Override
  public int hashCode() {
    int result = suit != null ? suit.hashCode() : 0;
    result = 31 * result + (denomination != null ? denomination.hashCode() : 0);
    return result;
  }
}
