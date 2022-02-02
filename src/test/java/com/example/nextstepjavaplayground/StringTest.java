package com.example.nextstepjavaplayground;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class StringTest {

  @Test
  void replace() {
    String actual = "abc".replace("b", "d");
    assertThat(actual).isEqualTo("adc");
  }

  @Test
  void test1() {
    String[] result1 = "1,2".split(",");
    assertThat(result1).contains("1", "2");
    assertThat(result1).containsExactly("1", "2");

    String[] result2 = "1,".split(",");
    assertThat(result2).contains("1");
  }

  @Test
  void test2() {
    String result = "(1,2)".substring(1,4);
    assertThat(result).isEqualTo("1,2");
  }

  @Test
  void test3() {
    String actual = "abc";
    assertThat(actual.charAt(0)).isEqualTo('a');

    assertThatThrownBy(() -> {
      actual.charAt(3);
    }).isInstanceOf(StringIndexOutOfBoundsException.class);
  }
}
