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
    return new Stay(cards());
  }

  @Override
  public boolean isFinished() {
    return true;
  }

  @Override
  public double profit(double rate) {
    return cards().getPrice() * rate;
  }

  public abstract double earningRate();
}
