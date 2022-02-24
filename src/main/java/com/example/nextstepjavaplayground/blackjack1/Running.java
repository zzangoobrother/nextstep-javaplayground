package com.example.nextstepjavaplayground.blackjack1;

public abstract class Running extends Started {

  public Running(Cards cards) {
    super(cards);
  }

  @Override
  public boolean isFinished() {
    return true;
  }

  @Override
  public double profit(double rate) {
    return cards().getPrice() * rate;
  }
}
