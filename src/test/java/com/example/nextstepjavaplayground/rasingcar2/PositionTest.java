package com.example.nextstepjavaplayground.rasingcar2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

  @Test
  @DisplayName("음수일 경우 오류")
  void randomNumNegative() {
    assertThatThrownBy(() -> new Position(-1))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  @DisplayName("4 이상일 경우 position 증가")
  void randomNumByMove() {
    Position position = new Position();
    position.move();
    assertThat(position).isEqualTo(new Position(1));
  }
}
