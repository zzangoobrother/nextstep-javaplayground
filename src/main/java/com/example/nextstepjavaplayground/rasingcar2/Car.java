package com.example.nextstepjavaplayground.rasingcar2;

public class Car {

  private String name;
  private Position position;

  public Car(String name, Position position) {
    if (name.length() > 5) {
      throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
    }
    this.name = name;
    this.position = position;
  }

  public Car(String name) {
    this(name, new Position());
  }
}
