package com.example.nextstepjavaplayground.rasingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RasingPlayTest {

  @Test
  @DisplayName("랜덤 값 4이상 확인하기")
  void randomCheck() {
    RasingPlay rasingPlay = new RasingPlay();
    assertThat(rasingPlay.randomForwardCheck(4)).isTrue();
  }

  @Test
  @DisplayName("자동차 전진 확인하기")
  void runCar() {
    Cars cars = new Cars("abcde");
    cars.forwardCar(0);
    assertThat(cars.getCar(0).getPosition()).isEqualTo(1);
  }

  @Test
  @DisplayName("우승자 판별하기")
  void winner() {
    Cars cars = new Cars("abcde,kang,seon");

    cars.forwardCar(0);
    cars.forwardCar(0);

    cars.forwardCar(1);
    cars.forwardCar(1);
    cars.forwardCar(1);

    cars.forwardCar(2);

    assertThat(cars.winner().get(0)).isEqualTo("kang");
  }
}
