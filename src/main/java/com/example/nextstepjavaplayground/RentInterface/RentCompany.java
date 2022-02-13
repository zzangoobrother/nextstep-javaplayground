package com.example.nextstepjavaplayground.RentInterface;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

  private static final String NEWLINE = System.getProperty("line.separator");

  private List<Car> cars = new ArrayList<>();

  public static RentCompany create() {
    return new RentCompany();
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public String generateReport() {
    StringBuilder sb = new StringBuilder();
    for (Car car : cars) {
      sb.append(car.getName());
      sb.append(" : ");
      sb.append((int) car.getChargeQuantity() + "리터" + NEWLINE);
    }
    return sb.toString();
  }
}
