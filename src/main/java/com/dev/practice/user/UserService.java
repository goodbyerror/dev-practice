package com.dev.practice.user;

import com.dev.practice.car.Car;

public interface UserService {
    void signUp(User signUpReq);  // 회원가입 (User 객체를 생성)
    void buyCar(Car car); // Car 객체를 생성
    Car getCarStatus(int carIdx);  // 구매한 차량의 현상태를 조회
    void pressAccelerator(int carIdx);  // 차량의 엑셀을 밟아서 속도 증가시키기
}