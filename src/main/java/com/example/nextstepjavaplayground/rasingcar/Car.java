package com.example.nextstepjavaplayground.rasingcar;

public class Car {
  private String name;
  private int position;

  public Car(String name, int position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return this.name;
  }

  public int getPosition() {
    return this.position;
  }
}
