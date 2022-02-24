package com.example.nextstepjavaplayground.blackjack1;

import java.util.List;

public class Cards {

  private static final int MAX_SUM = 21;
  private static final int ACE_ONE_OR_TEN = 11;
  private static final int PLUS_ACE_TEN = 10;

  private final String name;
  private final int price;
  private List<Card> cardList;

  private int sum;

  public Cards(String name, int price, List<Card> cardList) {
    this.name = name;
    this.price = price;
    this.cardList = cardList;
  }

  public int getSum() {
    sum = cardList.stream()
        .mapToInt(card -> card.getDenomination().getScore())
        .sum();

    if (cardAceAndSumCheck()) {
      sum += PLUS_ACE_TEN;
    }
    return sum;
  }

  private boolean cardAceAndSumCheck() {
    boolean aceFlag = cardList.stream()
        .anyMatch(card -> card.getDenomination().isAce());

    return aceFlag && sum <= ACE_ONE_OR_TEN;
  }

  public void add(Card card) {
    this.cardList.add(card);
  }

  public boolean isBust() {
    if (getSum() > MAX_SUM) {
      return true;
    }
    return false;
  }

  public int getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

  public List<Card> getCardList() {
    return this.cardList;
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
