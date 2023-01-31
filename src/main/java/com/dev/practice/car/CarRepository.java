package com.dev.practice.car;

public interface CarRepository {
    void makeCar(Car car);

    void incrementSpeed(int carIdx);

    Car getCarInfo(int carIdx);
}
