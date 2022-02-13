package com.example.nextstepjavaplayground.coordinateCaculator;

public class Coordinate {

  private static final int MAX_COORDINATE = 24;

  private int x;
  private int y;

  public Coordinate(int x, int y) {
    validate(x, y);
    this.x = x;
    this.y = y;
  }

  public void validate(int x, int y) {
    try {
      if (x > MAX_COORDINATE || y > MAX_COORDINATE) {
        throw new IllegalArgumentException("좌표는 24 이하의 크기만 가능합니다.");
      }
    } catch (IllegalArgumentException e) {
      System.out.println("좌표의 크기는 24 이하입니다. 다시 입력해주세요.");
    }
  }
}
