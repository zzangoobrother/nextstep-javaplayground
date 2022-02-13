package com.example.nextstepjavaplayground.RentInterface;

public class Avante implements Car{

  private static final double FUEL = 15;

  private double distance;

  public Avante(double distance) {
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
    return "Avante";
  }
}
