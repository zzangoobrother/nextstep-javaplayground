package com.example.nextstepjavaplayground.blackjack1;

import java.util.Arrays;

public enum Denomination {

  ACE(1),
  TOW(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(10),
  QUEEN(10),
  KING(10);

  private final int score;

  Denomination(int score) {
    this.score = score;
  }

  public boolean isAce() {
    return this == ACE;
  }

  public int getScore() {
    return score;
  }

  public Denomination getDenomination(int target) {
    if (target <= 9) {
      return Arrays.stream(values())
          .filter(denomination -> denomination.getScore() == target)
          .findFirst().get();
    }

    if (target == 10) {
      return Denomination.TEN;
    }

    if (target == 11) {
      return Denomination.JACK;
    }

    if (target == 12) {
      return Denomination.QUEEN;
    }

    return Denomination.KING;
  }
}
