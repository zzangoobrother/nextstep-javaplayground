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
}
