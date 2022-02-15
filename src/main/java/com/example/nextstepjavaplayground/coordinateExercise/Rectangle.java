package com.example.nextstepjavaplayground.coordinateExercise;

import java.util.List;

public class Rectangle extends AbstractFigure {

  public static final int RECTANGLE_POINT_SIZE = 4;

  public Rectangle(List<Point> points) {
    super(points);
  }

  @Override
  public int size() {
    return RECTANGLE_POINT_SIZE;
  }

  @Override
  public String getName() {
    return "사각형";
  }

  @Override
  public double area() {
    Point target = getPoint(0);
    Point xPoint = getXPoint(target);
    Point yPoint = getYPoint(target);

    return target.getDistance(xPoint) * target.getDistance(yPoint);
  }

  private Point getXPoint(Point target) {
    return getPoints().stream()
        .filter(point -> point.matchX(target))
        .filter(point -> !point.matchY(target))
        .findFirst()
        .orElseGet(null);
  }

  private Point getYPoint(Point target) {
    return getPoints().stream()
        .filter(point -> point.matchY(target))
        .filter(point -> !point.matchX(target))
        .findFirst()
        .orElseGet(null);
  }
}
