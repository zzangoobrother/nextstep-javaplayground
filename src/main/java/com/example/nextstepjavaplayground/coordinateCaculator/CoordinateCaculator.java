package com.example.nextstepjavaplayground.coordinateCaculator;

public interface CoordinateCaculator {

  public double caculator(Coordinates coordinates);

  default double caculatorLine(Coordinate coordinateFirst, Coordinate coordinateSeconde) {
    int x = coordinateFirst.xCoordinateCaculate(coordinateSeconde.getxCoordinate());
    int y = coordinateFirst.yCoordinateCaculate(coordinateSeconde.getyCoordinate());

    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
}
