package com.example.nextstepjavaplayground.rasingcar;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Cars {

  private final List<Car> cars;

  public Cars(String inputCarName) {
    String[] names = inputCarName.split(",");
    cars = Arrays.stream(names)
        .map(name -> new Car(name, 0))
        .collect(toList());
  }

  public int carsSize() {
    return cars.size();
  }

  public Car getCar(int index) {
    return cars.get(index);
  }

  public void forwardCar(int index) {
    cars.get(index).forwardPosition();
  }

  public List<String> winner() {
    int max = cars.stream().mapToInt(Car::getPosition).max().getAsInt();
    return cars.stream()
        .filter(car -> car.getPosition() == max)
        .map(Car::getName)
        .collect(toList());
  }
}
