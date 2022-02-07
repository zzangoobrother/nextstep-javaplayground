package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.List;

public class BallPlay {

  List<Ball> comBalls;

  public BallPlay(List<Integer> comBalls) {
    this.comBalls =makeBalls(comBalls);
  }

  private List<Ball> makeBalls(List<Integer> comBalls) {
    List<Ball> result = new ArrayList<>();
    for (int i = 0; i < comBalls.size(); i++) {
      result.add(new Ball(i + 1, comBalls.get(i)));
    }
    return result;
  }

  public PlayResult playResult(List<Integer> balls) {
    BallPlay userBalls = new BallPlay(balls);
    PlayResult playResult = new PlayResult();
    for (Ball ball : comBalls) {
      playResult.baseBallCheck(userBalls.play(ball));
    }
    return playResult;
  }

  public BallStatus play(Ball ball) {
    return comBalls.stream()
        .map(answer -> answer.play(ball))
        .filter(BallStatus::isNotNothing)
        .findFirst()
        .orElse(BallStatus.NOTHING);
  }
}
