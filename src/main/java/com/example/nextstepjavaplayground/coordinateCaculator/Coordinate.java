package com.example.nextstepjavaplayground.coordinateCaculator;

public class Coordinate {

  private static final int MAX_COORDINATE = 24;

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
}
