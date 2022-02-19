package com.example.nextstepjavaplayground.lambdaPractice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaPracticeTest {

  private List<Integer> numbers;
  private LambdaPractice lambdaPractice;

  @BeforeEach
  void setup() {
    numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    lambdaPractice = new LambdaPractice();
  }

  @Test
  void sumAllTest() {
    int sum = lambdaPractice.sumAll(numbers, number -> true);
    assertThat(sum).isEqualTo(21);
  }

  @Test
  void sumAllEvenTest() {
    int sum = lambdaPractice.sumAll(numbers, number -> number % 2 == 0);
    assertThat(sum).isEqualTo(12);
  }

  @Test
  void sumAllOverThreeTest() {
    int sum = lambdaPractice.sumAll(numbers, number -> number > 3);
    assertThat(sum).isEqualTo(15);
  }

  @Test
  void sumAllByConditionalTest() {
    int sum = lambdaPractice.sumAllByConditional(numbers, number -> true);
    assertThat(sum).isEqualTo(21);

    sum = lambdaPractice.sumAllByConditional(numbers, number -> number % 2 == 0);
    assertThat(sum).isEqualTo(12);

    sum = lambdaPractice.sumAllByConditional(numbers, number -> number > 3);
    assertThat(sum).isEqualTo(15);
  }
}