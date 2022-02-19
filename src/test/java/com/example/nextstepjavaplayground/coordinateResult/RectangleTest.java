package com.example.nextstepjavaplayground.coordinateResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {

  private List<Point> points;
  private Rectangle rectangle;

  @BeforeEach
  void setup() {
    points = Arrays.asList(new Point(1, 1), new Point(1, 15), new Point(3, 1), new Point(3, 15));
    rectangle = new Rectangle(points);
  }

  @Test
  void createRectangle() {
    assertThat(rectangle).isEqualTo(new Rectangle(points));
  }

  @Test
  void createRectangleError() {
    List<Point> illegalPoints = Arrays.asList(new Point(1, 1), new Point(1, 3), new Point(3, 1), new Point(3, 5));
    assertThrows(IllegalArgumentException.class, () -> {
      new Rectangle(illegalPoints);
    });
  }

  @Test
  void havePointsCheck() {
    assertThat(rectangle.hasPoint(3, 1)).isTrue();
    assertThat(rectangle.hasPoint(3, 5)).isFalse();
  }

  @Test
  void areaRectangle() {
    assertThat(rectangle.area()).isEqualTo(28);
  }
}
