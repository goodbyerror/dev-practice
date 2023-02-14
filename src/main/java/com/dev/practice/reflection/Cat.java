package com.dev.practice.reflection;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat {

    private final String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void meow() {
        System.out.println("meow");
    }

}
