package com.example.nextstepjavaplayground.blackjack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BlackjackView {

  private static Scanner scanner = new Scanner(System.in);

  private Map<String, State> stateMap = new HashMap<>();

  public void play() {
    System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉽표 기준으로 분리)");
    String players = scanner.nextLine();
    System.out.println();
    Set<Card> duplicatedCardCheck = new HashSet<>();
    createCards(players, duplicatedCardCheck);
    createDealerCards(duplicatedCardCheck);

    System.out.println("딜러와 " + players + "에게 카드를 2장 나누었습니다.");

    printPlayCard("딜러");
    System.out.println();
    printPlayCard(players.split(",")[0]);
    System.out.println();
    printPlayCard(players.split(",")[1]);
    System.out.println();

    onemoreCard(players.split(",")[0], duplicatedCardCheck);
    onemoreCard(players.split(",")[1], duplicatedCardCheck);

    if (getCards("딜러").cards().getSum() <= 16) {
      dealerOnemoreCard(duplicatedCardCheck);
    }

    printPlayCard("딜러");
    printCardSum("딜러");

    printPlayCard(players.split(",")[0]);
    printCardSum(players.split(",")[0]);

    printPlayCard(players.split(",")[1]);
    printCardSum(players.split(",")[1]);
  }

  private void createCards(String players, Set<Card> duplicatedCardCheck) {
    String[] names = players.split(",");
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + "의 배팅 금액은?");
      int price = scanner.nextInt();
      Cards cards = new Cards(names[i], price, new ArrayList<>());
      createTwoCard(cards, duplicatedCardCheck);
      cardsPut(names[i], cards);
      System.out.println();
    }
  }

  private void createDealerCards(Set<Card> duplicatedCardCheck) {
    Cards cards = new Cards("딜러", 10000, new ArrayList<>());
    createTwoCard(cards, duplicatedCardCheck);
    cardsPut("딜러", cards);
  }

  private void createTwoCard(Cards cards, Set<Card> duplicatedCardCheck) {
    int count = 0;
    while (count < 2) {
      count = crateCards(cards, duplicatedCardCheck, count);
    }
  }

  private int crateCards(Cards cards, Set<Card> duplicatedCardCheck, int count) {
    Card card = createCard();
    if (!duplicatedCardCheck.contains(card)) {
      duplicatedCardCheck.add(card);
      cards.add(card);
      count++;
    }

    return count;
  }

  private Card createCard() {
    int suitNum = (int) ((Math.random() * 4));
    int denominationNum = (int) ((Math.random() * 13));
    Suit[] suits = Suit.values();
    Denomination[] denominations = Denomination.values();

    return new Card(suits[suitNum], denominations[denominationNum]);
  }

  private void printPlayCard(String name) {
    Cards cards = getCards(name).cards();
    StringBuilder sb = new StringBuilder();
    for (Card card : cards.getCardList()) {
      sb.append(card.getDenomination().getScore()).append(card.getSuit().getName()).append(" ");
    }
    System.out.print(name + ": " + sb.toString());
  }

  private void printCardSum(String name) {
    Cards cards = getCards(name).cards();
    System.out.println(" - 결과: " + cards.getSum());
  }

  private State onemoreCard(String name, Set<Card> duplicatedCardCheck) {
    System.out.println(name + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
    String yesOrNo = scanner.next();
    State state = getCards("딜러");

    if ("y".equals(yesOrNo)) {
      return yesOnemoreCard(name, state, duplicatedCardCheck);
    }

    return state.stay();
  }

  private State yesOnemoreCard(String name, State state, Set<Card> duplicatedCardCheck) {
    Card card = cardsCheck(duplicatedCardCheck);
    duplicatedCardCheck.add(card);
    State stateDraw = state.draw(card);
    printPlayCard(name);
    System.out.println();
    return stateDraw;
  }

  private void dealerOnemoreCard(Set<Card> duplicatedCardCheck) {
    System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
    Card card = cardsCheck(duplicatedCardCheck);
    duplicatedCardCheck.add(card);
    State state = getCards("딜러");
    state.draw(card);
  }

  private Card cardsCheck(Set<Card> duplicatedCardCheck) {
    Card card = createCard();
    while(duplicatedCardCheck.contains(card)) {
      card = createCard();
    }
    return card;
  }

  private State getCards(String name) {
    return stateMap.get(name);
  }

  private void cardsPut(String name, Cards cards) {
    stateMap.put(name, new Hit(cards));
  }
}
