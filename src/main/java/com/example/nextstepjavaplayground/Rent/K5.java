package com.example.nextstepjavaplayground.Rent;

public class K5 extends Car{

  private static final double FUEL = 13;

  private double distance;

  public K5(double distance) {
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
    return "K5";
  }
}
