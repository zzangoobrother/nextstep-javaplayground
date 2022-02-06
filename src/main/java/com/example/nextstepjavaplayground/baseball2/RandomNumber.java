package com.example.nextstepjavaplayground.baseball2;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {

  public int createRandomNumber() {
    return (int) ((Math.random() * 9) + 1);
  }

  public List<Integer> computerRandomNumber() {
    List<Integer> computerRandomNumber = new ArrayList<>();

    while (computerRandomNumber.size() < 3) {
      int randomNum = createRandomNumber();
      if (!computerRandomNumber.contains(randomNum)) {
        computerRandomNumber.add(randomNum);
      }
    }
    return computerRandomNumber;
  }
}
