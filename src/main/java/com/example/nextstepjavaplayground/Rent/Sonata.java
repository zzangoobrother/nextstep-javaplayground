package com.example.nextstepjavaplayground.Rent;

public class Sonata extends Car{

  private static final double FUEL = 10;

  private double distance;

  public Sonata(double distance) {
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
    return "Sonata";
  }
}
