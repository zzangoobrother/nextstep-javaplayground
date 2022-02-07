package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballPrint {

  private List<Integer> comBalls;
  private Scanner scanner = new Scanner(System.in);

  public BaseballPrint(List<Integer> comBalls) {
    this.comBalls = comBalls;
  }

  public void print() {
    BallPlay ballPlay = new BallPlay(comBalls);

    boolean flag = true;
    while (flag) {
      flag = ballPlay(ballPlay);
    }
  }

  private boolean ballPlay(BallPlay ballPlay) {
    System.out.print("숫자를 입력해 주세요 : ");
    List<Integer> userBalls = makeUserNumber(scanner.next());
    int strike = playResultPrint(ballPlay, userBalls);
    return !(strike == 3);
  }

  private int playResultPrint(BallPlay ballPlay, List<Integer> userBalls) {
    PlayResult playResult = ballPlay.playResult(userBalls);

    int ball = playResult.getBall();
    int strike = playResult.getStrike();
    if (ball > 0) {
      System.out.print(ball + "볼 ");
    }

    if (strike > 0) {
      System.out.print(strike + "스트라이크");
    }

    playResult.nothingPrint();
    System.out.println();

    return strike;
  }

  private List<Integer> makeUserNumber(String input) {
    List<Integer> userBalls = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      userBalls.add(Integer.parseInt(input.substring(i, i+1)));
    }

    return userBalls;
  }
}
