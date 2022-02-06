package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallNumberTest {

  BallNumber ballNumber;

  @BeforeEach
  void setup() {
    ballNumber = new BallNumber();
  }

  @Test
  @DisplayName("입력받은 숫자가 1에서 9사이의 숫자 확인")
  void inputNumberCheckTrue() {
    assertThat(ballNumber.numberCheck(1)).isTrue();
    assertThat(ballNumber.numberCheck(10)).isFalse();
  }
}
