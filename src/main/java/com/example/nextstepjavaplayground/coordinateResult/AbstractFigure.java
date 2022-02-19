package com.example.nextstepjavaplayground.coordinateResult;

import java.util.List;

public abstract class AbstractFigure implements Figure {
  static final String ERROR_FIGURE_NULL = "올바른 Point 값이 아닙니다.";
  private final List<Point> points;

  AbstractFigure(List<Point> points) {
    if (points == null || points.isEmpty()) {
      throw new IllegalArgumentException(ERROR_FIGURE_NULL);
    }
    this.points = points;
  }

  @Override
  public List<Point> getPoints() {
    return points;
  }

  @Override
  public boolean hasPoint(int x, int y) {
    return getPoints().stream().anyMatch(point -> point.isSame(x, y));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    AbstractFigure that = (AbstractFigure) o;

    return points != null ? points.equals(that.points) : that.points == null;
  }

  @Override
  public int hashCode() {
    return points != null ? points.hashCode() : 0;
  }
}
