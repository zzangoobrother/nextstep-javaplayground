package com.example.nextstepjavaplayground.coordinateCaculator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

  @Test
  @DisplayName("좌표는 최대 24까지만 입력받는다.")
  void coordinateMaxCheck() {
    assertThrows(IllegalArgumentException.class,
        () -> new Coordinate(25, 6), "좌표의 크기는 24 이하입니다. 다시 입력해주세요.");
  }
}
