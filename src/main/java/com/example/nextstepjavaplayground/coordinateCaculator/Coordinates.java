package com.example.nextstepjavaplayground.coordinateCaculator;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

  private List<Coordinate> coordinates = new ArrayList<>();

  public Coordinates(String inputTarget) {
    String[] targets = inputTarget.split("-");
    for (String target : targets) {
      coordinates.add(getCoordinate(target));
    }
  }

  private Coordinate getCoordinate(String target) {
    target = target.replaceAll("[(|)]", "");
    String[] indexs = target.split(",");
    return new Coordinate(Integer.parseInt(indexs[0]), Integer.parseInt(indexs[1]));
  }

  public List<Coordinate> getCoordinates() {
    return this.coordinates;
  }
}
