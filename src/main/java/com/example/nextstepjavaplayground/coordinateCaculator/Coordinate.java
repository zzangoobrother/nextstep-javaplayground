package com.example.nextstepjavaplayground.coordinateCaculator;

public class Coordinate {

  private XCoordinate xCoordinate;
  private YCoordinate yCoordinate;

  public Coordinate(int x, int y) {
    try {
      xCoordinate = new XCoordinate(x);
      yCoordinate = new YCoordinate(y);
    } catch (IllegalArgumentException e) {
      System.out.println("좌표의 크기는 24 이하입니다. 다시 입력해주세요.");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Coordinate that = (Coordinate) o;

    if (xCoordinate != null ? !xCoordinate.equals(that.xCoordinate) : that.xCoordinate != null) {
      return false;
    }
    return yCoordinate != null ? yCoordinate.equals(that.yCoordinate) : that.yCoordinate == null;
  }

  @Override
  public int hashCode() {
    int result = xCoordinate != null ? xCoordinate.hashCode() : 0;
    result = 31 * result + (yCoordinate != null ? yCoordinate.hashCode() : 0);
    return result;
  }
}
