package com.example.nextstepjavaplayground.baseball;

public class CompareNumber {

  public int ball(String randomNum, String inputNum) {
    int ball = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue;
        }

        if (randomNum.charAt(i) == inputNum.charAt(j)) {
          ball++;
        }
      }
    }

    return ball;
  }
}
