package com.example.nextstepjavaplayground.blackjack1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

  @Test
  @DisplayName("카드 생성")
  void createCard() {
    Card card = new Card(Suit.CLUBS, Denomination.ACE);
    assertThat(card).isEqualTo(new Card(Suit.CLUBS, Denomination.ACE));
  }
}
