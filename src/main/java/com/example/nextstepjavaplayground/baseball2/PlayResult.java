package com.example.nextstepjavaplayground.baseball2;

public class PlayResult {

  private int ball = 0;
  private int strike = 0;

  public int getBall() {
    return this.ball;
  }

  public int getStrike() {
    return this.strike;
  }

  public void nothingPrint() {
    if (ball == 0 && strike == 0) {
      System.out.print(BallStatus.NOTHING);
    }
  }

  public void baseBallCheck(BallStatus status) {
    if (status.isStrike()) {
      strike++;
    }

    if (status.isBall()) {
      ball++;
    }
  }
}
