package com.example.nextstepjavaplayground.baseball;

import java.util.Scanner;

public class BaseballPrint {
  Scanner scanner;
  CompareNumber compareNumber;

  public BaseballPrint() {
    scanner = new Scanner(System.in);
    compareNumber = new CompareNumber();
  }

  public void numberPrint() {
    RandomNumber randomNumber = new RandomNumber();

    int clear = 1;
    while (clear == 1) {
      String answer = randomNumber.randomNum();
      numberInput(answer);

      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
      System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

      clear = scanner.nextInt();
    }
  }

  private void numberInput(String answer) {
    int strike = 0;
    while (strike < 3) {
      System.out.println("숫자를 입력해 주세요 : ");
      String inputNum = scanner.next();

      ballPrint(answer, inputNum);
      strike = strikePrint(answer, inputNum);
    }
  }

  private void ballPrint(String answer, String inputNum) {
    int ball = compareNumber.ball(answer, inputNum);
    if (ball > 0) {
      System.out.print(ball + "볼 ");
    }
  }

  private int strikePrint(String answer, String inputNum) {
    int strike = compareNumber.strike(answer, inputNum);
    System.out.println(strike + "스트라이크");

    return strike;
  }
}
