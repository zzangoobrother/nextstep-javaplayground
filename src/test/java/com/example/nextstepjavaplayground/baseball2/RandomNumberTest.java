package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {

  private RandomNumber randomNumber;

  @BeforeEach
  void setup() {
    randomNumber = new RandomNumber();
  }

  @Test
  @DisplayName("1에서 9까지의 랜덤 숫자 생성")
  void createRandomNumber() {
    int randomNum = randomNumber.createRandomNumber();
    assertThat(randomNum >= 1).isTrue();
    assertThat(randomNum <= 9).isTrue();
  }

}
