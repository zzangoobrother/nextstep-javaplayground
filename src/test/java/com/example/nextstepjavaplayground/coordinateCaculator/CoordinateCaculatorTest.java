package com.example.nextstepjavaplayground.coordinateCaculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinateCaculatorTest {

  @Test
  @DisplayName("선 길이 구하기")
  void coordinateLine() {
    Coordinates coordinates = new Coordinates("(10,10)-(14,15)");
    LineCoordinateCaculator line = new LineCoordinateCaculator();
    assertThat(line.caculator(coordinates)).isEqualTo(6.403124, offset(0.00099));
  }
}
