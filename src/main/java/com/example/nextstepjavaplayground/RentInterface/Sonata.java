package com.example.nextstepjavaplayground.RentInterface;

public class Sonata implements Car{

  private static final double FUEL = 10;

  private double distance;

  public Sonata(double distance) {
    this.distance = distance;
  }

  @Override
  public double getDistancePerLiter() {
    return FUEL;
  }

  @Override
  public double getTripDistance() {
    return this.distance;
  }

  @Override
  public String getName() {
    return "Sonata";
  }
}
