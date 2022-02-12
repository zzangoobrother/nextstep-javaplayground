package com.example.nextstepjavaplayground.rasingcar;

public class RasingPlay {

  public void play(Cars cars, int count) {
    for (int i = 0; i < count; i++) {
      forwardCarsPlay(cars);
    }

  }

  private void forwardCarsPlay(Cars cars) {
    for (int i = 0; i < cars.carsSize(); i++) {
      forwardCar(cars.getCar(i));
    }
    System.out.println();
  }

  private void forwardCar(Car car) {
    int randomNum = (int) ((Math.random() * 9) + 1);
    System.out.print(car.getName() + " : ");

    if (randomForwardCheck(randomNum)) {
      car.forwardPosition();
    }

    for (int i = 0; i < car.getPosition(); i++) {
      System.out.print("-");
    }

    System.out.println();
  }

  public boolean randomForwardCheck(int randomNum) {
    return randomNum >= 4;
  }
}
