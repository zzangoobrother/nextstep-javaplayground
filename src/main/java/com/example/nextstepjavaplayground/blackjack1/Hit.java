package com.example.nextstepjavaplayground.blackjack1;

public class Hit extends Running {

  public Hit(Cards cards) {
    super(cards);
  }

  public State draw(Card card) {
    Cards cards = cards();
    cards.add(card);
    if (cards.isBust()) {
      return new Bust(cards);
    }
    return new Hit(cards);
  }

  @Override
  public State stay() {
    return new Stay(cards());
  }
}
