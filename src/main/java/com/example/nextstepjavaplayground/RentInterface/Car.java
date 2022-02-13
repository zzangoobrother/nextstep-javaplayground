package com.example.nextstepjavaplayground.RentInterface;

public interface Car {

  // 리터당 이동 거리. 연비
  double getDistancePerLiter();

  // 여행하려는 거리
  double getTripDistance();

  // 차종 이름
  String getName();

  // 주입해야할 연료량
  default double getChargeQuantity() {
    return getTripDistance() / getDistancePerLiter();
  }
}
