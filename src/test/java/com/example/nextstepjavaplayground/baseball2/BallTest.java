package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {

  Ball ball;

  @BeforeEach
  void setup() {
    ball = new Ball(1, 2);
  }

  @Test
  @DisplayName("낫싱 판별하기")
  void nothing() {
    assertThat(ball.play(new Ball(2, 1))).isEqualTo(BallStatus.NOTHING);
  }

  @Test
  @DisplayName("볼 판별하기")
  void ballCheck() {
    assertThat(ball.play(new Ball(2, 2))).isEqualTo(BallStatus.BALL);
  }

  @Test
  @DisplayName("스트라이크 판별하기")
  void strikeCheck() {
    assertThat(ball.play(new Ball(1, 2))).isEqualTo(BallStatus.STRIKE);
  }
}
