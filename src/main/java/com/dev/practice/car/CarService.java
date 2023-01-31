package com.dev.practice.car;

public interface CarService {
    void makeCar(Car car);

    Car findCarStatus(int carIdx);

    void pressAccelerator(int carIdx);
}
