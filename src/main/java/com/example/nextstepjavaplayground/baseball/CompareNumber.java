package com.example.nextstepjavaplayground.baseball;

public class CompareNumber {
  int strike;
  int ball;

  public int ball(String randomNum, String inputNum) {
    ball = 0;
    for (int i = 0; i < 3; i++) {
      ballCompare(randomNum, inputNum, i);
    }
    return ball;
  }

  private void ballCompare(String randomNum, String inputNum, int i) {
    for (int j = 0; j < 3; j++) {
      ballCount(randomNum, inputNum, i, j);
    }
  }

  private void ballCount(String randomNum, String inputNum, int i, int j) {
    if (numCompare(randomNum, inputNum, i, j)) {
      ball++;
    }
  }

  private boolean numCompare(String randomNum, String inputNum, int i, int j) {
    return i != j && randomNum.charAt(i) == inputNum.charAt(j);
  }

  public int strike(String randomNum, String inputNum) {
    strike = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j && randomNum.charAt(i) == inputNum.charAt(j)) {
          strike++;
        }
      }
    }
    return strike;
  }
}
