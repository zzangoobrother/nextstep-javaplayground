package com.example.nextstepjavaplayground.coordinateExercise;

import java.util.List;

public class Triangle extends AbstractFigure {

  public static final int TRIANGLE_POINT_SIZE = 3;

  public Triangle(List<Point> points) {
    super(points);
  }

  @Override
  public int size() {
    return TRIANGLE_POINT_SIZE;
  }

  @Override
  public String getName() {
    return "삼각형";
  }

  @Override
  public double area() {
    double distance = getPoint(0).getDistance(getPoint(1));
    double distance1 = getPoint(1).getDistance(getPoint(2));
    double distance2 = getPoint(2).getDistance(getPoint(0));

    double temp = (distance + distance1 + distance2) / 2;
    return Math.sqrt(temp * (temp - distance) * (temp - distance1) * (temp - distance2));
  }
}
