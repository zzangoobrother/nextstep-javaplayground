package com.example.nextstepjavaplayground.rasingcar2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
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

  @Test
  @DisplayName("자동차 경주 우승자 판별")
  void rasingCarWinner() {
    Cars cars = new Cars(Arrays.asList(
        new Car("홍길동", new Position(2)),
        new Car("이순신", new Position(3)),
        new Car("정약용", new Position(3)))
    );

    assertThat(cars.rasingWinner()).contains(new Car("이순신", new Position(3)), new Car("정약용", new Position(3)));
  }
}
