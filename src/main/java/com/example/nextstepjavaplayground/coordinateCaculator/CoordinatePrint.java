package com.example.nextstepjavaplayground.coordinateCaculator;

public class CoordinatePrint {

  private static final int MAX_COORDINATE = 24;

  public void print(Coordinates coordinates) {
    for (int i = MAX_COORDINATE; i > 0; i--) {
      if (i % 2 == 0) {
        if (i >= 10) {
          System.out.print(i + "|");
        } else {
          System.out.print(i + " |");
        }
      } else {
        System.out.print("  |");
      }

      System.out.println();
    }
    System.out.println("+------------------------");

  }
}
