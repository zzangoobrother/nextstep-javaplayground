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

  public void baseBallCheck(BallStatus status) {
    if (status.isStrike()) {
      strike++;
    }

    if (status.isBall()) {
      ball++;
    }
  }
}
