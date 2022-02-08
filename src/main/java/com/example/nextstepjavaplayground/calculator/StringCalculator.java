package com.example.nextstepjavaplayground.calculator;

import java.util.Arrays;

public class StringCalculator {

  public static int splitAndSum(String input) {
    if (input == null || input.isBlank()) {
      return 0;
    }

    CalculatorNumber calculatorNumber = new CalculatorNumber(input);
    return Arrays.stream(calculatorNumber.getNumbers()).mapToInt(Integer::parseInt).sum();
  }
}
