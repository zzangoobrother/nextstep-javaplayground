package com.example.nextstepjavaplayground.blackjack1;

public class Hit implements State {

  private final Cards cards;

  public Hit(Cards cards) {
    this.cards = cards;
  }

  public State draw(Card card) {
    cards.add(card);
    if (cards.isBust()) {
      return new Bust(cards);
    }
    return new Hit(cards);
  }

  public Cards cards() {
    return this.cards;
  }
}
