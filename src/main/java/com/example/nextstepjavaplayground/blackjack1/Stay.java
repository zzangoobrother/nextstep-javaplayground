package com.example.nextstepjavaplayground.blackjack1;

public class Stay extends Finished {

  public Stay(Cards cards) {
    super(cards);
  }

  @Override
  public double earningRate() {
    return 0;
  }
}
