package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

  @Test
  @DisplayName("1에서 9까지 중복없는 3자리 숫자 생성")
  void computerRandomNumber() {
    List<Integer> computerNumbers = randomNumber.computerRandomNumber();
    Set<Integer> tempNumbers = new HashSet<>(computerNumbers);
    assertThat(tempNumbers.size()).isEqualTo(3);
  }
}
