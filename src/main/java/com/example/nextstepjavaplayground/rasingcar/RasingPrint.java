package com.example.nextstepjavaplayground.rasingcar;

import java.util.List;
import java.util.Scanner;

public class RasingPrint {

  public void print() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    String inputName = scanner.next();

    Cars cars = new Cars(inputName);
    System.out.println("시도할 회수는 몇회인가요?");
    int count = scanner.nextInt();

    System.out.println("실행 결과");
    RasingPlay rasingPlay = new RasingPlay();
    rasingPlay.play(cars, count);
    List<String> winners = cars.winner();

    for (String winner : winners) {
      System.out.print(winner + ", ");
    }

    System.out.println("가 최종 우승했습니다.");
  }
}
