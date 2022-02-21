package com.example.nextstepjavaplayground.blackjack1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

  private List<Card> includeAcecardList;
  private List<Card> notIncludeAcecardList;

  @BeforeEach
  void setup() {
    includeAcecardList = Arrays.asList(new Card(Suit.CLUBS, Denomination.ACE), new Card(Suit.DIAMONDS, Denomination.EIGHT));
    notIncludeAcecardList = Arrays.asList(new Card(Suit.CLUBS, Denomination.JACK), new Card(Suit.DIAMONDS, Denomination.EIGHT));
  }

  @Test
  @DisplayName("카드 생성")
  void createCard() {
    Card card = new Card(Suit.CLUBS, Denomination.ACE);
    assertThat(card).isEqualTo(new Card(Suit.CLUBS, Denomination.ACE));
  }

  @Test
  @DisplayName("처음 카드 두장 제공")
  void createCards() {
    Cards cards = new Cards("홍길동", 10000, includeAcecardList);
    assertThat(cards).isEqualTo(new Cards("홍길동", 10000, Arrays.asList(new Card(Suit.CLUBS, Denomination.ACE), new Card(Suit.DIAMONDS, Denomination.EIGHT))));
  }

  @Test
  @DisplayName("카드의 합")
  void addCardNumber() {
    Cards cards = new Cards("홍길동", 10000, notIncludeAcecardList);
    assertThat(cards.getSum()).isEqualTo(18);
  }

  @Test
  @DisplayName("ACE가 있을 경우 카드들의 합이 11이하 이면 ACE를 11로 계산")
  void isACEByAddOneOrEleven() {
    Cards cards = new Cards("홍길동", 10000, includeAcecardList);
    assertThat(cards.getSum()).isEqualTo(19);
  }
}
