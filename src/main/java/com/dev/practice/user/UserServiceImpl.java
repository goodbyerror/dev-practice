package com.dev.practice.user;

import com.dev.practice.car.Car;
import com.dev.practice.car.CarService;
import com.dev.practice.user.User;
import com.dev.practice.user.UserService;

public class UserServiceImpl implements UserService {

    private final CarService carService;
    private final UserRepository userRepository;

    public UserServiceImpl(CarService carService, UserRepository userRepository){
        this.carService = carService;
        this.userRepository = userRepository;
    }

    @Override // User 객체를 생성
    public void signUp(User signUpReq){
        userRepository.makeUser(signUpReq);
    }

    @Override // Car 객체를 생성
    public void buyCar(Car car) {
        carService.makeCar(car);
    }

    @Override // Car 객체를 carIdx 값을 통해 조회
    public Car getCarStatus(int carIdx) {
        return carService.findCarStatus(carIdx);
    }

    @Override // 자동차 엑셀 밟기
    public void pressAccelerator(int carIdx) {
        carService.pressAccelerator(carIdx);
    }
}