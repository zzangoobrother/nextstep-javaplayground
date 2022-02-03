package com.example.nextstepjavaplayground.baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareNumberTest {

  private CompareNumber compareNumber;

  @BeforeEach
  void setUp() {
    compareNumber = new CompareNumber();
  }

  @Test
  @DisplayName("1볼인 경우")
  void oneBallTest() {
    int ball = compareNumber.ball("123", "452");
    assertThat(ball).isEqualTo(1);
  }

  @Test
  @DisplayName("2볼인 경우")
  void twoBallTest() {
    int ball = compareNumber.ball("123", "412");
    assertThat(ball).isEqualTo(2);
  }

  @Test
  @DisplayName("3볼인 경우")
  void threeBallTest() {
    int ball = compareNumber.ball("123", "312");
    assertThat(ball).isEqualTo(3);
  }

  @Test
  @DisplayName("1스트라이크인 경우")
  void oneStrikeTest() {
    int strike = compareNumber.strike("123", "156");
    assertThat(strike).isEqualTo(1);
  }

  @Test
  @DisplayName("2스트라이크인 경우")
  void twoStrikeTest() {
    int strike = compareNumber.strike("123", "126");
    assertThat(strike).isEqualTo(2);
  }

  @Test
  @DisplayName("3스트라이크인 경우")
  void threeStrikeTest() {
    int strike = compareNumber.strike("123", "123");
    assertThat(strike).isEqualTo(3);
  }
}