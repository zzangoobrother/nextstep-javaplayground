package com.example.nextstepjavaplayground.rasingcar;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class RasingCarName {

  public boolean validation(String name) {
    return name.length() <= 5;
  }

  public List<Car> makeCars(String inputCarName) {
    String[] names = inputCarName.split(",");
    return Arrays.stream(names)
        .map(name -> new Car(name, 0))
        .collect(toList());
  }
}
