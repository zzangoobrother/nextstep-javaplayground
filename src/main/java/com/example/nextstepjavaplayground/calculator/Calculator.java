package com.example.nextstepjavaplayground.calculator;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    String[] values = value.split(" ");

    Calculate calculate = new Calculate();

    int result = Integer.parseInt(values[0]);
    for (int i = 1; i < values.length - 1; i += 2) {
      result = calculate.cal(result, Integer.parseInt(values[i+1]), values[i].charAt(0));
    }

    System.out.println(result);
  }
}
