package com.dev.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Child.class;
        System.out.println("Class Name: " + clazz.getName());


        Child child = new Child();
        Class clazz2 = Class.forName("com.dev.practice.reflection.Child");
        Method method = clazz2.getDeclaredMethod("method4", int.class);
        method.invoke(child, 1);
    }
}
