package com.example.nextstepjavaplayground.baseball2;

public class Ball {
  private final int MAX_BALL_NUMBER = 9;
  private final int MIN_BALL_NUMBER = 1;

  private int position;
  private int num;

  public Ball(int position, int num) {
    this.position = position;
    this.num = num;
  }

  public BallStatus play(Ball ball) {
    if (this.equals(ball)) {
      return BallStatus.STRIKE;
    }

    if (ball.matchBall(this.num)) {
      return BallStatus.BALL;
    }

    return BallStatus.NOTHING;
  }

  private boolean matchBall(int num) {
    return this.num == num;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Ball ball = (Ball) o;

    if (position != ball.position) {
      return false;
    }
    return num == ball.num;
  }

  @Override
  public int hashCode() {
    int result = position;
    result = 31 * result + num;
    return result;
  }
}
