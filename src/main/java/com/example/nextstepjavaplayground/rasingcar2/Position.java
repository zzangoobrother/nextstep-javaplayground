package com.example.nextstepjavaplayground.rasingcar2;

public class Position {

  private int position;

  public Position(int position) {
    this.position = position;
  }

  public Position() {
    this(0);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Position position1 = (Position) o;

    return position == position1.position;
  }

  @Override
  public int hashCode() {
    return position;
  }
}
