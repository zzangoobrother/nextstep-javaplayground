package com.example.nextstepjavaplayground.blackjack1;

public abstract class Finished extends Started {

  public Finished(Cards cards) {
    super(cards);
  }

  @Override
  public State draw(Card card) {
    return null;
  }

  @Override
  public State stay() {
    return null;
  }

  public abstract double earningRate();
}
