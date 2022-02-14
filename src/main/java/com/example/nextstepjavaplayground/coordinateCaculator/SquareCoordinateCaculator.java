package com.example.nextstepjavaplayground.coordinateCaculator;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SquareCoordinateCaculator implements CoordinateCaculator {

  @Override
  public double caculator(Coordinates coordinates) {
    List<Coordinate> coordinatesList = coordinates.getCoordinates();
    Collections.sort(coordinatesList, (o1, o2) -> {
        if (getXLength(o1, o2) > 0) {
          return getYLength(o1, o2);
        }

        if (getXLength(o1, o2) < 0) {
          return getYLength(o2, o1);
        }

        return getXLength(o1, o2);
      }
    );

    Set<Double> lines = getLengths(coordinatesList);

    int result = 1;

    if (lines.size() == 1) {
      result = getFoursquare(lines);
      return result * result;
    }

    for (double x : lines) {
      result *= x;
    }
    return result;
  }

  private int getXLength(Coordinate origin, Coordinate target) {
    return origin.getxCoordinate().getX() - target.getxCoordinate().getX();
  }

  private int getYLength(Coordinate origin, Coordinate target) {
    return origin.getyCoordinate().getY() - target.getyCoordinate().getY();
  }

  private Set<Double> getLengths(List<Coordinate> coordinatesList) {
    Set<Double> lines = new HashSet<>();
    for (int i = 0; i < coordinatesList.size() - 1; i++) {
      lines.add(caculatorLine(coordinatesList.get(i), coordinatesList.get(i + 1)));
    }
    return lines;
  }

  private int getFoursquare(Set<Double> lines) {
    int result = 1;
    for (double x : lines) {
      result = (int) x;
    }
    return result;
  }
}
