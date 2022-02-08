package com.example.nextstepjavaplayground.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  @Test
  @DisplayName("null 또는 빈문자")
  void sumNullOrEmptyString() {
    int result = StringCalculator.splitAndSum(null);
    assertThat(result).isEqualTo(0);

    result = StringCalculator.splitAndSum("");
    assertThat(result).isEqualTo(0);
  }

  @Test
  @DisplayName("숫자가 하나인 경우")
  void oneNumber() {
    int result = StringCalculator.splitAndSum("1");
    assertThat(result).isEqualTo(1);
  }

  @Test
  @DisplayName("쉼표구분자인 경우 합 구하기")
  void commaBySum() {
    int result = StringCalculator.splitAndSum("1,2");
    assertThat(result).isEqualTo(3);
  }

  @Test
  @DisplayName("쉼표 또는 콜론 구분자인 경우 합 구하기")
  void commaOrColonBySum() {
    int result = StringCalculator.splitAndSum("1,2:3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  @DisplayName("custom 구분자인 경우 합 구하기")
  void customBySum() {
    int result = StringCalculator.splitAndSum("//;\n1;2;3");
    assertThat(result).isEqualTo(6);
  }

  @Test
  @DisplayName("음수가 있는 경우")
  void negative() {
    assertThatThrownBy(() -> StringCalculator.splitAndSum("-1,2,3"))
        .isInstanceOf(RuntimeException.class);
  }
}
