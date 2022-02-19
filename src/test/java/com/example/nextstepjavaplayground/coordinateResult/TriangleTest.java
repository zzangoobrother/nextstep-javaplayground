package com.example.nextstepjavaplayground.coordinateResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {

  private List<Point> points;
  private Triangle triangle;

  @BeforeEach
  void setup() {
    points = Arrays.asList(new Point(1, 1), new Point(2, 10), new Point(7, 5));
    triangle = new Triangle(points);
  }

  @Test
  void createTriangle() {
    assertThat(triangle).isEqualTo(new Triangle(points));
  }

  @Test
  void createTriangleError() {
    List<Point> illegalPoints = Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 3));
    assertThrows(IllegalArgumentException.class, () -> {
      new Rectangle(illegalPoints);
    });
  }

  @Test
  void getPointsCheck() {
    assertThat(triangle.hasPoint(1, 1)).isTrue();
    assertThat(triangle.hasPoint(1, 3)).isFalse();
  }

  @Test
  void triangleAreaCaculate() {
    assertThat(triangle.area()).isEqualTo(25.000, offset(0.00099));
  }
}
