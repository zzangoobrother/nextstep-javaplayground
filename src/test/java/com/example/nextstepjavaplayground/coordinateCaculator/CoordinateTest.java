package com.example.nextstepjavaplayground.coordinateCaculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
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

  @Test
  @DisplayName("좌표와 좌표 사이는 '-' 문자로 구부한다.")
  void coordinateOfSplite() {
    Coordinates coordinates = new Coordinates("(10,10)-(14,15)");
    List<Coordinate> coordinateList = coordinates.getCoordinates();
    assertThat(coordinateList).contains(
        new Coordinate(10, 10),
        new Coordinate(14, 15)
    );
  }
}
