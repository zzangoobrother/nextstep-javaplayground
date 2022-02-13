package com.example.nextstepjavaplayground.coordinateCaculator;

public class XCoordinate {

  private static final int MAX_COORDINATE = 24;

  private int x;

  public XCoordinate(int x) {
    if (x > MAX_COORDINATE) {
      throw new IllegalArgumentException("좌표는 24 이하의 크기만 가능합니다.");
    }
    this.x = x;
  }
}
