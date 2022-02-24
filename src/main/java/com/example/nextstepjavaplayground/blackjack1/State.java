package com.example.nextstepjavaplayground.blackjack1;

public interface State {

  public Cards cards();

  public State draw(Card card);

  public State stay();

  public boolean isFinished();

  public double profit(double rate);
}
