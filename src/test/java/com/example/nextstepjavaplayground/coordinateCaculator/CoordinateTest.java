package com.example.nextstepjavaplayground.coordinateCaculator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

  @Test
  @DisplayName("좌표는 최대 24까지만 입력받는다.")
  void coordinateMaxCheck() {
    assertThatThrownBy(() -> new XCoordinate(25))
        .isInstanceOf(IllegalArgumentException.class);

    assertThatThrownBy(() -> new YCoordinate(25))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
