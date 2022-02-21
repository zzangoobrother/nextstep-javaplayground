package com.example.nextstepjavaplayground.blackjack1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BlackjackTest {

  private List<Card> cardList = new ArrayList<>();

  @BeforeEach
  void setup() {
    cardList.add(new Card(Suit.CLUBS, Denomination.ACE));
    cardList.add(new Card(Suit.DIAMONDS, Denomination.JACK));
  }

  @Test
  @DisplayName("처음 2장 카드의 합이 21 블랙잭인 경우 배팅 금액은 1.5배")
  void cardsSumBlackjack() {
    Cards cards = new Cards("홍길동", 10000, cardList);
    Blackjack blackjack = new Blackjack(cards);

    assertThat(blackjack.earningRate()).isEqualTo(15000.0);
  }
}
