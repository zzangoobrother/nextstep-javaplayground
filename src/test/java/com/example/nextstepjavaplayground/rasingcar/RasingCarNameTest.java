package com.example.nextstepjavaplayground.rasingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RasingCarNameTest {

  @Test
  @DisplayName("자동자 이름 5자 이하 확인")
  void carNameLengthCheck() {
    RasingCarName rasingCarName = new RasingCarName();
    boolean nameLengthCheck = rasingCarName.validation("kang");
    assertThat(nameLengthCheck).isTrue();
  }
}
