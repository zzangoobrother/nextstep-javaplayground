package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.List;

public class BallNumber {

  private final int MAX_BALL_NUMBER = 9;
  private final int MIN_BALL_NUMBER = 1;

  private List<Integer> userNumbers = new ArrayList<>();

  public boolean numberCheck(int inputNum) {
    return inputNum >= MIN_BALL_NUMBER && inputNum <= MAX_BALL_NUMBER;
  }
}
