package com.example.nextstepjavaplayground.blackjack1;

public class Blackjack extends Finished {

  public Blackjack(Cards cards) {
    super(cards);
  }

  @Override
  public double earningRate() {
    return 1.5;
  }
}
