package com.example.nextstepjavaplayground.blackjack1;

public class Bust extends Finished {
  public Bust(Cards cards) {
    super(cards);
  }

  public double earningRate() {
    return 0.0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Bust bust = (Bust) o;
    Cards cards = cards();
    return cards != null ? cards.equals(bust.cards()) : bust.cards() == null;
  }

  @Override
  public int hashCode() {
    Cards cards = cards();
    return cards != null ? cards.hashCode() : 0;
  }
}
