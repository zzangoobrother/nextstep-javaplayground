package com.example.nextstepjavaplayground.blackjack1;

public enum Suit {
  CLUBS("클로버"),
  DIAMONDS("다이아몬드"),
  HEARTS("하트"),
  SPADES("스페이드");

  private final String name;

  Suit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Suit getSuit(int target) {
    if (target == 1) {
      return Suit.CLUBS;
    }

    if (target == 2) {
      return Suit.DIAMONDS;
    }

    if (target == 3) {
      return Suit.HEARTS;
    }
    return Suit.SPADES;
  }
}
