package com.example.nextstepjavaplayground.blackjack1;

public abstract class Started implements State {

  private Cards cards;

  public Started(Cards cards) {
    this.cards = cards;
  }

  @Override
  public Cards cards() {
    return this.cards;
  }
}
