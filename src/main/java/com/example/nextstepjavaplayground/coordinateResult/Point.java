package com.example.nextstepjavaplayground.coordinateResult;

public class Point {

  private static final String ERROR_OUT_OF_POINT_RANGE
      = "잘못된 범위의 입력값입니다. 정수 범위는 " + Point.LOWER_LIMIT + " ~ " + Point.UPPER_LIMIT + " 사이의 수로 입력해주세요.";

  public static final int LOWER_LIMIT = 1;
  public static final int UPPER_LIMIT = 24;
  private final int x;
  private final int y;

  public Point(int x, int y) {
    checkRangeOf(x, y);
    this.x = x;
    this.y = y;
  }

  private void checkRangeOf(int x, int y) {
    if (exceedRange(x) || exceedRange(y)) {
      throw new IllegalArgumentException(ERROR_OUT_OF_POINT_RANGE);
    }
  }

  private boolean exceedRange(int target) {
    return target < LOWER_LIMIT || target > UPPER_LIMIT;
  }

  public double calculateSlope(Point point) {
    if (this.x == point.getX()) {
      return Double.MAX_VALUE;
    }
    return Math.abs((double) (this.y - point.getY()) / (this.x - point.getX()));
  }

  public double calculateDistance(Point point) {
    return Math.sqrt(squareDifference(this.x, point.getX()) + squareDifference(this.y, point.getY()));
  }

  private double squareDifference(int firstValue, int secondValue) {
    return Math.pow(firstValue - secondValue, 2);
  }

  public boolean isSame(int x, int y) {
    return this.x == x && this.y == y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Point point = (Point) o;

    if (x != point.x) {
      return false;
    }
    return y == point.y;
  }

  @Override
  public int hashCode() {
    int result = x;
    result = 31 * result + y;
    return result;
  }
}
