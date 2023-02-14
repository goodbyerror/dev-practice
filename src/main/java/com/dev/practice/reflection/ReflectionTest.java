package com.dev.practice.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // List 인터페이스의 경로를 가져와서 Class 객체를 생성
        Class<?> listClass = Class.forName("java.util.List");

        // 메소드 조회
        Method[] methods = listClass.getDeclaredMethods();

        Arrays.stream(methods).forEach(x -> {
            Parameter[] paramList = x.getParameters();
            System.out.println(x);

            Arrays.stream(paramList).forEach(p -> System.out.println(p));
        });
    }

}
