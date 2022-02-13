package com.example.nextstepjavaplayground.RentInterface;

public class K5 implements Car{

  private static final double FUEL = 13;

  private double distance;

  public K5(double distance) {
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
    return "K5";
  }
}
