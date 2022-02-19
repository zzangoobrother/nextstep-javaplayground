package com.example.nextstepjavaplayground.coordinateResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {

  @Test
  void createPoint() {
    assertThat(new Point(1, 2)).isEqualTo(new Point(1, 2));
  }

  @Test
  @DisplayName("좌표 범위를 넘어가는 값이 입력된 경우")
  void checkedCoordinate() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Point(0, 1);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      new Point(1, 0);
    });

    assertThrows(IllegalArgumentException.class, () -> {
      new Point(1, 25);
    });
  }

  @Test
  void coordinateCompare() {
    assertThat(new Point(1, 2).isSame(1, 2)).isTrue();
    assertThat(new Point(1, 2).isSame(1, 3)).isFalse();
  }
}
