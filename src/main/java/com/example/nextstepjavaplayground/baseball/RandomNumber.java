package com.example.nextstepjavaplayground.baseball;

public class RandomNumber {

  public String randomNum() {
    String answer = "";
    boolean[] flag = new boolean[10];

    while (answer.length() < 3) {
      int temp = (int) ((Math.random() * 9) + 1);
      answer += random(flag, temp);
    }

    return answer;
  }

  private String random(boolean[] flag, int temp) {
    if (!flag[temp]) {
      flag[temp] = true;
      return String.valueOf(temp);
    }

    return "";
  }
}
