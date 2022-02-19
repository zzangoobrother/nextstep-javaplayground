package com.example.nextstepjavaplayground.lambdaPractice;

import java.util.List;

public class LambdaPractice {

  public int sumAll(List<Integer> numbers, Conditional conditional) {
    int total = 0;
    for (int number : numbers) {
      if (conditional.test(number)) {
        total += number;
      }
    }
    return total;
  }

  public int sumAllEven(List<Integer> numbers, Conditional conditional) {
    int total = 0;
    for (int number : numbers) {
      if (conditional.test(number)) {
        total += number;
      }
    }
    return total;
  }

  public int sumAllOverThree(List<Integer> numbers, Conditional conditional) {
    int total = 0;
    for (int number : numbers) {
      if (conditional.test(number)) {
        total += number;
      }
    }
    return total;
  }

  public int sumAllByConditional(List<Integer> numbers, Conditional conditional) {
    return numbers.stream()
        .filter(conditional::test)
        .reduce(0, Integer::sum);
  }
}
