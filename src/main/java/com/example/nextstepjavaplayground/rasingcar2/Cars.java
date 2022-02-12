package com.example.nextstepjavaplayground.rasingcar2;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  private List<Car> cars;

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

  public List<Car> getCars() {
    return this.cars;
  }
}
