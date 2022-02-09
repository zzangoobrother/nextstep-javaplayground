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

  public List<Car> getCars() {
    return cars;
  }
}
