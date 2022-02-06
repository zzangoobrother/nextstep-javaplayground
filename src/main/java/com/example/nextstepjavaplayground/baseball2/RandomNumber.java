package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {

  public List<Integer> computerRandomNumber() {
    List<Integer> computerRandomNumber = new ArrayList<>();

    while (computerRandomNumber.size() < 3) {
      makeRandomNumbers(computerRandomNumber);
    }
    return computerRandomNumber;
  }

  public int createRandomNumber() {
    return (int) ((Math.random() * 9) + 1);
  }

  private void makeRandomNumbers(List<Integer> computerRandomNumber) {
    int randomNum = createRandomNumber();
    if (!computerRandomNumber.contains(randomNum)) {
      computerRandomNumber.add(randomNum);
    }
  }
}
