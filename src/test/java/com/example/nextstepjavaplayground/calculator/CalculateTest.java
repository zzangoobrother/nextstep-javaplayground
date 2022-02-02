package com.example.nextstepjavaplayground.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateTest {

  Calculate calculate;

  @BeforeEach
  void setUp() {
    calculate = new Calculate();
  }

  @Test
  void addTest() {
    int result = calculate.cal(1, 2, '+');
    assertThat(result).isEqualTo(3);
  }

  @Test
  void minusTest() {
    int result = calculate.cal(2, 1, '-');
    assertThat(result).isEqualTo(1);
  }

  @Test
  void multiTest() {
    int result = calculate.cal(1, 2, '*');
    assertThat(result).isEqualTo(2);
  }

  @Test
  void divideTest() {
    int result = calculate.cal(4, 2, '/');
    assertThat(result).isEqualTo(2);
  }
}