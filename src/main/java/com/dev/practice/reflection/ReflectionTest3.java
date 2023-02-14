package com.dev.practice.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest3 {

    public static void main(String[] args) {
        Cat myCat = new Cat("Stella", 5);

        Field[] fields = myCat.getClass().getDeclaredFields();

        Arrays.stream(fields).forEach(x -> {
            if (x.getName().equals("name")) {
                try {
                    x.setAccessible(true);
                    x.set(myCat, "haru");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println(myCat.getName());

        Method[] methods = myCat.getClass().getDeclaredMethods();

        Arrays.stream(methods).forEach(x -> {
            if ("meow".equals(x.getName())) {
                try {
                    x.invoke(myCat);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
