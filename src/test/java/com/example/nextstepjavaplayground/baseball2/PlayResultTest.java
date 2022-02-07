package com.example.nextstepjavaplayground.baseball2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayResultTest {

  @Test
  @DisplayName("1볼 판별하기")
  void oneBall() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(2, 4, 5));
    assertThat(playResult.getBall()).isEqualTo(1);
  }

  @Test
  @DisplayName("2볼 판별하기")
  void twoBall() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(2, 3, 5));
    assertThat(playResult.getBall()).isEqualTo(2);
  }

  @Test
  @DisplayName("3볼 판별하기")
  void threeBall() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(2, 3, 1));
    assertThat(playResult.getBall()).isEqualTo(3);
  }

  @Test
  @DisplayName("1스트라이크 판별하기")
  void oneStrike() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(1, 4, 5));
    assertThat(playResult.getStrike()).isEqualTo(1);
  }

  @Test
  @DisplayName("2스트라이크 판별하기")
  void twoStrike() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(1, 2, 5));
    assertThat(playResult.getStrike()).isEqualTo(2);
  }

  @Test
  @DisplayName("3스트라이크 판별하기")
  void threeStrike() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(1, 2, 3));
    assertThat(playResult.getStrike()).isEqualTo(3);
  }

  @Test
  @DisplayName("1스트라이크 1볼 판별하기")
  void oneStrike_oneBall() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(1, 4, 2));
    assertThat(playResult.getStrike()).isEqualTo(1);
    assertThat(playResult.getBall()).isEqualTo(1);
  }

  @Test
  @DisplayName("1스트라이크 2볼 판별하기")
  void oneStrike_twoBall() {
    BallPlay ballPlay = new BallPlay(Arrays.asList(1, 2, 3));
    PlayResult playResult = ballPlay.playResult(Arrays.asList(1, 3, 2));
    assertThat(playResult.getStrike()).isEqualTo(1);
    assertThat(playResult.getBall()).isEqualTo(2);
  }
}
