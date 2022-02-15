package com.example.nextstepjavaplayground.coordinateCaculator;

import java.util.ArrayList;
import java.util.List;

public class TriangleCoordinateCaculator implements CoordinateCaculator {

  @Override
  public double caculator(Coordinates coordinates) {
    List<Coordinate> coordinatesList = coordinates.getCoordinates();
    List<Double> lengths = getTriangleLengths(coordinatesList);

    double result = getHeron(lengths);
    return Math.sqrt(result * (result - lengths.get(0)) * (result - lengths.get(1)) * (result - lengths.get(2)));
  }

  private List<Double> getTriangleLengths(List<Coordinate> coordinatesList) {
    List<Double> lengths = new ArrayList<>();
    int count = coordinatesList.size();
    for (int i = 0; i < count - 1; i++) {
      lengths.add(caculatorLine(coordinatesList.get(i), coordinatesList.get(i + 1)));
    }
    lengths.add(caculatorLine(coordinatesList.get(count - 1), coordinatesList.get(0)));
    return lengths;
  }

  private double getHeron(List<Double> lengths) {
    double result = 0;
    for (double x : lengths) {
      result += x;
    }
    return result / 2;
  }
}
