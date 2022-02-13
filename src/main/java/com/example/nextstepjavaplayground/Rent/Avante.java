package com.example.nextstepjavaplayground.Rent;

public class Avante extends Car{

  private static final double FUEL = 15;

  private double distance;

  public Avante(double distance) {
    this.distance = distance;
  }

  @Override
  double getDistancePerLiter() {
    return FUEL;
  }

  @Override
  double getTripDistance() {
    return this.distance;
  }

  @Override
  String getName() {
    return "Avante";
  }
}
