package com.example.nextstepjavaplayground.blackjack1;

import java.util.List;

public class Cards {

  private final String name;
  private final int price;
  private final List<Card> cardList;

  public Cards(String name, int price, List<Card> cardList) {
    this.name = name;
    this.price = price;
    this.cardList = cardList;
  }

  public int getSum() {
    int sum = cardList.stream().mapToInt(card -> card.getDenomination().getScore()).sum();
    if (sum <= 11) {
      sum += 10;
    }

    return sum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Cards cards = (Cards) o;

    if (price != cards.price) {
      return false;
    }
    if (name != null ? !name.equals(cards.name) : cards.name != null) {
      return false;
    }
    return cardList != null ? cardList.equals(cards.cardList) : cards.cardList == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;
    result = 31 * result + (cardList != null ? cardList.hashCode() : 0);
    return result;
  }
}
