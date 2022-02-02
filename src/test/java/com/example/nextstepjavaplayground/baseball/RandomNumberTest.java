package com.example.nextstepjavaplayground.baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomNumberTest {

  RandomNumber randomNumber;

  @BeforeEach
  void setUp() {
    randomNumber = new RandomNumber();
  }

  @Test
  void randomTest() {
    int random = Integer.parseInt(randomNumber.randomNum());
    assertThat(random >= 123).isTrue();
    assertThat(random <= 987).isTrue();
  }
}