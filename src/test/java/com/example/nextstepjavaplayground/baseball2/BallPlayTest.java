package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallPlayTest {

  BallPlay ballPlay;

  @BeforeEach
  void setup() {
    ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
  }

  @Test
  @DisplayName("낫싱 판별하기")
  void nothing() {
    assertThat(ballPlay.play(new Ball(1, 4))).isEqualTo(BallStatus.NOTHING);
  }

  @Test
  @DisplayName("볼 판별하기")
  void ballCheck() {
    assertThat(ballPlay.play(new Ball(1, 3))).isEqualTo(BallStatus.BALL);
  }

  @Test
  @DisplayName("스트라이크 판별하기")
  void strikeCheck() {
    assertThat(ballPlay.play(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
  }
}
