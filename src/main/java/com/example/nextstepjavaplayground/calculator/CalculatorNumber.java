package com.example.nextstepjavaplayground.calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorNumber {

  private String[] numbers;

  public CalculatorNumber(String input) {
    makeNumbers(input);
    negative();
  }

  private void makeNumbers(String input) {
    Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
    if (matcher.find()) {
      String customDelimiter = matcher.group(1);
      numbers = matcher.group(2).split(",|:|" + customDelimiter);
      return;
    }

    numbers = input.split(",|:");
  }

  private void negative() {
    int nev = Arrays.stream(numbers).mapToInt(Integer::parseInt).filter(i -> i < 0).findFirst().orElse(0);
    if (nev < 0) {
      throw new RuntimeException();
    }
  }

  public String[] getNumbers() {
    return this.numbers;
  }
}
