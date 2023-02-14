package com.dev.practice.reflection;

import lombok.AllArgsConstructor;

public class Parent {
    private String str1;
    private String str2;

    private void method1() {
        System.out.println("method1");
    }

    public void method2(int n) {
        System.out.println("method2");
    }

    private void method3() {
        System.out.println("method3");
    }
}
