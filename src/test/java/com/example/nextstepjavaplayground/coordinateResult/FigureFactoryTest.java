package com.example.nextstepjavaplayground.coordinateResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FigureFactoryTest {

  private List<Point> points;

  @BeforeEach
  void setup() {
    points = new ArrayList<>();
  }

  @Test
  void inputNullCheck() {
    assertThrows(IllegalArgumentException.class, () -> {
      FigureFactory.create(null);
    });
  }

  @Test
  void onePointInputCheck() {
    points.add(new Point(1, 2));
    assertThrows(IllegalArgumentException.class, () -> {
      FigureFactory.create(points);
    });
  }

  @Test
  void fivePointInputCheck() {
    points.add(new Point(1, 2));
    points.add(new Point(3, 5));
    points.add(new Point(5, 6));
    points.add(new Point(7, 9));
    points.add(new Point(11, 13));
    assertThrows(IllegalArgumentException.class, () -> {
      FigureFactory.create(points);
    });
  }

  @Test
  void createLine() {
    points.add(new Point(1, 2));
    points.add(new Point(3, 4));
    assertThat(FigureFactory.create(points)).isEqualTo(new Line(points));
  }

  @Test
  void createTriangle() {
    points.add(new Point(1, 2));
    points.add(new Point(3, 4));
    points.add(new Point(4, 7));
    assertThat(FigureFactory.create(points)).isEqualTo(new Triangle(points));
  }

  @Test
  void createRectangle() {
    points.add(new Point(1, 2));
    points.add(new Point(3, 4));
    points.add(new Point(1, 4));
    points.add(new Point(3, 2));
    assertThat(FigureFactory.create(points)).isEqualTo(new Rectangle(points));
  }


}
