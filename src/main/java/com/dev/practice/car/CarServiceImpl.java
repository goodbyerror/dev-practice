package com.dev.practice.car;

import com.dev.practice.car.Car;
import com.dev.practice.car.CarRepository;

public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override  // Car 데이터 DB 에 저장
    public void makeCar(Car car) {
        carRepository.makeCar(car);
    }

    @Override  //  엑셀을 밟았을때 속도가 증가하도록 하는것
    public void pressAccelerator(int carIdx) {
        carRepository.incrementSpeed(carIdx);
    }

    @Override   // carIdx 값에 해당하는 차량의 현 상태 조회
    public Car findCarStatus(int carIdx) {
        return carRepository.getCarInfo(carIdx);
    }
}