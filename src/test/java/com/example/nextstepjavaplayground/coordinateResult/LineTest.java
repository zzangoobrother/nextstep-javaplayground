package com.example.nextstepjavaplayground.coordinateResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LineTest {

  private Line line;

  @BeforeEach
  void setup() {
    List<Point> points = Arrays.asList(new Point(1, 2), new Point(3, 4));
    line = new Line(points);
  }

  @Test
  void pointCheck() {
    assertThat(line.hasPoint(3, 4)).isTrue();
    assertThat(line.hasPoint(3, 5)).isFalse();
  }

  @Test
  void lineLengthCaculate() {
    assertThat(line.area()).isEqualTo(2.828, offset(0.00099));
  }
}
