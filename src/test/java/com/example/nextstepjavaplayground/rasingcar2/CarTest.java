package com.example.nextstepjavaplayground.rasingcar2;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

  @Test
  @DisplayName("자동차 이름은 5자를 초과할 수 없다.")
  void carNameLengthCheck() {
    assertThatThrownBy(() -> new Car("abcdef", new Position()))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
