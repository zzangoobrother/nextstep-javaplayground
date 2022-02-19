package com.example.nextstepjavaplayground.coordinateResult;

public class CoordinateGame {

  public static void main(String[] args) {
    Figure figure = InputView.inputCoordinates();
    OutputView.showCoordinatePlane(figure);
    OutputView.showArea(figure);
  }
}
