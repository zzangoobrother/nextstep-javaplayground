package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BallNumber {

  private final int MAX_BALL_NUMBER = 9;
  private final int MIN_BALL_NUMBER = 1;
  private final int BALL_COUNT = 3;

  private List<Integer> userNumbers = new ArrayList<>();

  public boolean numberCheck(int inputNum) {
    return inputNum >= MIN_BALL_NUMBER && inputNum <= MAX_BALL_NUMBER;
  }

  public boolean numberDigit(List<Integer> numbers) {
    return numbers.size() == BALL_COUNT;
  }

  public boolean numberDuplicate(List<Integer> numbers) {
    Set<Integer> tempNumbers = new HashSet<>(numbers);
    return tempNumbers.size() == BALL_COUNT;
  }
}
