package com.example.nextstepjavaplayground.blackjack1;

public class Bust extends Finished {

  private final Cards cards;

  public Bust(Cards cards) {
    this.cards = cards;
  }

  public double earningRate() {
    return cards.getPrice() * 0.0;
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

    return cards != null ? cards.equals(bust.cards) : bust.cards == null;
  }

  @Override
  public int hashCode() {
    return cards != null ? cards.hashCode() : 0;
  }
}
