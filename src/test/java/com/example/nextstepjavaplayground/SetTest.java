package com.example.nextstepjavaplayground;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {

  private Set<Integer> numbers;

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  void test() {
    assertThat(numbers.size()).isEqualTo(3);
    assertThat(numbers.contains(1)).isTrue();
    assertThat(numbers.contains(4)).isFalse();
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  void test2(int input) {
    assertThat(numbers.contains(input)).isTrue();
  }

  @ParameterizedTest
  @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
  void test3(int input, boolean expected) {
    assertThat(numbers.contains(input)).isEqualTo(expected);
  }
}
