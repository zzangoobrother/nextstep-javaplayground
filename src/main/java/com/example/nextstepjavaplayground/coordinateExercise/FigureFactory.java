package com.example.nextstepjavaplayground.coordinateExercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory implements FigureCreator {

  private static final int LINE_POINT_SIZE = 2;
  private static final int TRIANGLE_POINT_SIZE = 3;
  private static final int RECTANGLE_POINT_SIZE = 4;
  private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

  @Override
  public Figure create(List<Point> points) {
    classifier.put(LINE_POINT_SIZE, Line::new);
    classifier.put(TRIANGLE_POINT_SIZE, Triangle::new);
    classifier.put(RECTANGLE_POINT_SIZE, Rectangle::new);

    if (points == null) {
      throw new IllegalArgumentException();
    }

    int numOfPoints = points.size();
    if (numOfPoints < LINE_POINT_SIZE || numOfPoints > RECTANGLE_POINT_SIZE) {
      throw new IllegalArgumentException();
    }

    return classifier.get(points.size()).apply(points);
  }
}
