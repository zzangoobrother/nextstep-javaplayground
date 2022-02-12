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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Car car = (Car) o;

    if (name != null ? !name.equals(car.name) : car.name != null) {
      return false;
    }
    return position != null ? position.equals(car.position) : car.position == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (position != null ? position.hashCode() : 0);
    return result;
  }
}
