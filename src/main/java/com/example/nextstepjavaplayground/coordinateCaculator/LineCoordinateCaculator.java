package com.example.nextstepjavaplayground.coordinateCaculator;

import java.util.List;

public class LineCoordinateCaculator implements CoordinateCaculator {

  @Override
  public double caculator(Coordinates coordinates) {
    List<Coordinate> coordinatesList = coordinates.getCoordinates();
    return caculatorLine(coordinatesList.get(0), coordinatesList.get(1));
  }
}
