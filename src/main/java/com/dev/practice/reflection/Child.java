package com.dev.practice.reflection;

import lombok.AllArgsConstructor;

public class Child extends Parent {

    public String chi;
    private String ch2;

    public int method4(int n) {
        System.out.println("method4: " + n);
        return n;
    }

    public int method5(int n) {
        System.out.println("method5: " + n);
        return n;
    }
}
