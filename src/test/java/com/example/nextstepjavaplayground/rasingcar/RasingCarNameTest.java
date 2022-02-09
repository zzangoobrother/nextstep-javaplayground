package com.example.nextstepjavaplayground.rasingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
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

  @Test
  @DisplayName("이름 쉼표 구분하기")
  void namesComma() {
    RasingCarName rasingCarName = new RasingCarName();
    List<Car> cars = rasingCarName.makeCars("abcde,kang,seon");
    assertThat(cars.size()).isEqualTo(3);
    assertThat(cars.get(0).getName()).isEqualTo("abcde");
    assertThat(cars.get(1).getName()).isEqualTo("kang");
    assertThat(cars.get(2).getName()).isEqualTo("seon");
  }
}
