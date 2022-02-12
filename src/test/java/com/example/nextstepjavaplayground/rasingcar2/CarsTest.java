package com.example.nextstepjavaplayground.rasingcar2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

  @Test
  @DisplayName("자동차 이름은 쉼표를 기준으로 구분")
  void commaCarNamesSplit() {
    Cars cars = new Cars("홍길동,이순신,정약용");
    assertThat(cars.getCars()).contains(new Car("홍길동"));
    assertThat(cars.getCars()).contains(new Car("이순신"));
    assertThat(cars.getCars()).contains(new Car("정약용"));
  }
}
