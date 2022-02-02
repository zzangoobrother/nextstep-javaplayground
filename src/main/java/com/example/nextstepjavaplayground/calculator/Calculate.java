package com.example.nextstepjavaplayground.calculator;

public class Calculate {

  public int cal(int num1, int num2, char oper) {
    if (oper == '+') {
      return add(num1, num2);
    } else if (oper == '-') {
      return minus(num1, num2);
    } else if (oper == '*') {
      return multi(num1, num2);
    } else if (oper == '/') {
      return divide(num1, num2);
    }

    return num1;
  }

  private int add(int num1, int num2) {
    return num1 + num2;
  }

  private int minus(int num1, int num2) {
    return num1 - num2;
  }

  private int multi(int num1, int num2) {
    return num1 * num2;
  }

  private int divide(int num1, int num2) {
    return num1 / num2;
  }
}
