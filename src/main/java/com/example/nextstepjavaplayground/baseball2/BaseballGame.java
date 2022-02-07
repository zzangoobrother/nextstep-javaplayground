package com.example.nextstepjavaplayground.baseball2;

import java.util.Scanner;

public class BaseballGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int flag = 1;

    while (flag == 1) {
      RandomNumber randomNumber = new RandomNumber();
      BaseballPrint print = new BaseballPrint(randomNumber.computerRandomNumber());
      print.print();

      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
      System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
      flag = scanner.nextInt();
    }
  }
}
