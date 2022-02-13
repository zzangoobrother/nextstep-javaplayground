package com.example.nextstepjavaplayground.rasingcar2;

import java.util.List;
import java.util.Scanner;

public class RasingPlay {

  private static final int RANDOM_NUMBER = 4;

  private Scanner scanner = new Scanner(System.in);

  public void play() {
    Cars cars = new Cars(inputName());
    playResult(cars.getCars());

    List<Car> winners = cars.rasingWinner();
    winnerPrint(winners);
  }

  private String inputName() {
    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    return scanner.next();
  }

  private void playResult(List<Car> cars) {
    int count = tryCount();
    System.out.println("실행 결과");
    for(int i = 0; i < count; i++) {
      for (Car car : cars) {
        carMove(car);
        printCar(car);
      }
      System.out.println();
    }
  }

  private int tryCount() {
    System.out.println("시도할 회수는 몇회인가요?");
    return scanner.nextInt();
  }

  private void carMove(Car car) {
    int randomNum = (int) ((Math.random() * 9) + 1);
    if (randomNum > RANDOM_NUMBER) {
      car.getPosition().move();
    }
  }

  private void printCar(Car car) {
    System.out.print(car.getName() + " : ");

    for (int j = 0; j < car.getPosition().getPosition(); j++) {
      System.out.print("-");
    }
    System.out.println();
  }

  private void winnerPrint(List<Car> winners) {
    for (Car car : winners) {
      System.out.print(car.getName() + ", ");
    }
    System.out.println("가 최종 우승했습니다.");
  }
}
