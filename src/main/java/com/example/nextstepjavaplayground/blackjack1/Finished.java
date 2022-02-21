package com.example.nextstepjavaplayground.blackjack1;

public abstract class Finished implements State {

  public abstract double earningRate();

  @Override
  public State draw(Card card) {
    return null;
  }

  @Override
  public Cards cards() {
    return null;
  }
}
