package com.example.nextstepjavaplayground.baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}