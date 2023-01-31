package com.dev.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@ExtendWith(MockitoExtension.class)
public class LambdaTest {

    @Test
    void lambdaTest() {
        List<Integer> testList = new ArrayList<>();

        //sort를 사용하기 위해 익명 클래스를 생성해야 한다.
        Collections.sort(testList, new Comparator<Integer>(){
            @Override
            public int compare(Integer prev, Integer next) {
                return prev.compareTo(next);
            }
        });

        Collections.sort(testList, (prev, next) -> prev.compareTo(next));

        //forEach를 사용하기 위해 익명 클래스를 생성해야 한다.
        testList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        testList.forEach(integer -> System.out.println(integer));
    }
}
