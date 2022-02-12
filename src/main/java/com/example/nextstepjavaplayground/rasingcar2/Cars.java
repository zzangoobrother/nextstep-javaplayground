package com.example.nextstepjavaplayground.rasingcar2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

  private List<Car> cars;

  public Cars(List<Car> cars) {
    this.cars = cars;
  }

  public Cars(String names) {
    this.cars = makeOfCars(names);
  }

  private List<Car> makeOfCars(String inputNames) {
    cars = new ArrayList<>();

    String[] names = inputNames.split(",");
    for (String name : names) {
      cars.add(new Car(name));
    }

    return cars;
  }

  public List<Car> rasingWinner() {
    int maxPosition = cars.stream()
        .mapToInt(car -> car.getPosition().getPosition())
        .max().getAsInt();

    return cars.stream()
        .filter(car -> car.getPosition().getPosition() == maxPosition)
        .collect(Collectors.toList());
  }

  public List<Car> getCars() {
    return this.cars;
  }
}
