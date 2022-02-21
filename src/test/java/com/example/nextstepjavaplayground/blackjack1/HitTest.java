package com.example.nextstepjavaplayground.blackjack1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HitTest {

  private List<Card> cardList = new ArrayList<>();

  @BeforeEach
  void setup() {
    cardList.add(new Card(Suit.CLUBS, Denomination.NINE));
    cardList.add(new Card(Suit.DIAMONDS, Denomination.EIGHT));
  }

  @Test
  @DisplayName("합이 21 이하일 경우 카드를 추가로 받기")
  void cardsSumCheck() {
    Cards cards = new Cards("홍길동", 10000, cardList);
    Hit hit = new Hit(cards);
    State state = hit.draw(new Card(Suit.HEARTS, Denomination.THREE));

    cardList.add(new Card(Suit.HEARTS, Denomination.THREE));
    assertThat(state.cards()).isEqualTo(new Cards("홍길동", 10000, cardList));
  }

  @Test
  @DisplayName("카드 추가 후 합이 21을 넘는 경우")
  void cardsSumOverCheck() {
    cardList.add(new Card(Suit.DIAMONDS, Denomination.JACK));
    Cards cards = new Cards("홍길동", 10000, cardList);
    Hit hit = new Hit(cards);
    State state = hit.draw(new Card(Suit.HEARTS, Denomination.THREE));

    assertThat(state).isEqualTo(new Bust(cards));
  }

  @AfterEach
  void after() {
    cardList = null;
  }
}
