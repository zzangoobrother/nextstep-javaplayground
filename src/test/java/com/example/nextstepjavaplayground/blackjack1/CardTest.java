package com.example.nextstepjavaplayground.blackjack1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

  @Test
  @DisplayName("카드 생성")
  void createCard() {
    Card card = new Card(Suit.CLUBS, Denomination.ACE);
    assertThat(card).isEqualTo(new Card(Suit.CLUBS, Denomination.ACE));
  }

  @Test
  @DisplayName("처음 카드 두장 제공")
  void createCards() {
    List<Card> cardList = Arrays.asList(new Card(Suit.CLUBS, Denomination.ACE), new Card(Suit.DIAMONDS, Denomination.EIGHT));
    Cards cards = new Cards("홍길동", 10000, cardList);

    assertThat(cards).isEqualTo(new Cards("홍길동", 10000, Arrays.asList(new Card(Suit.CLUBS, Denomination.ACE), new Card(Suit.DIAMONDS, Denomination.EIGHT))));
  }
}
