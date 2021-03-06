package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallNumberTest {

  ValidationUtil validationUtil;

  @BeforeEach
  void setup() {
    validationUtil = new ValidationUtil();
  }

  @Test
  @DisplayName("입력받은 숫자가 1에서 9사이의 숫자 확인")
  void inputNumberCheckTrue() {
    assertThat(validationUtil.numberCheck(1)).isTrue();
    assertThat(validationUtil.numberCheck(10)).isFalse();
  }

  @Test
  @DisplayName("입력받은 숫자가 3자리 인지 확인")
  void inputNumberDigit() {
    assertThat(validationUtil.numberDigit(Arrays.asList(1, 2, 3))).isTrue();
    assertThat(validationUtil.numberDigit(Arrays.asList(1, 2))).isFalse();
  }

  @Test
  @DisplayName("서로 다른 3개의 숫자인지 확인")
  void inputNumberDuplicate() {
    assertThat(validationUtil.numberDuplicate(Arrays.asList(1, 2, 3))).isTrue();
    assertThat(validationUtil.numberDuplicate(Arrays.asList(1, 2, 2))).isFalse();
  }
}
