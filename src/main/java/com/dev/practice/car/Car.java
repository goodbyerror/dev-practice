package com.dev.practice.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    int carIdx;
    String carName;
    int curSpeed;  // 현재 속도 : 엑셀을 밟는 요청이 들어올때마다, 차종에 따라 다른값으로 일정량 증가
    int userIdx;   // 어떤 유저의 차량인지 (= 외래키(Foreign key) 와 유사)
}