package com.example.nextstepjavaplayground.lambdaPractice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamStudyTest {

  private List<Integer> numbers;

  @BeforeEach
  void setup() {
    numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
  }

  @Test
  void sumOverThreeAndDouble() {
    int result = numbers.stream()
        .filter(number -> number > 3)
        .mapToInt(i -> i * 2)
        .reduce(0, Integer::sum);

    assertThat(result).isEqualTo(30);
  }


}
