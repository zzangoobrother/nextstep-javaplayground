package com.example.nextstepjavaplayground.coordinateCaculator;

public class YCoordinate {

  private static final int MAX_COORDINATE = 24;

  private int y;

  public YCoordinate(int y) {
    if (y > MAX_COORDINATE) {
      throw new IllegalArgumentException("좌표는 24 이하의 크기만 가능합니다.");
    }
    this.y = y;
  }

  public int caculate(YCoordinate target) {
    return this.y - target.getY();
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

    YCoordinate that = (YCoordinate) o;

    return y == that.y;
  }

  @Override
  public int hashCode() {
    return y;
  }
}
