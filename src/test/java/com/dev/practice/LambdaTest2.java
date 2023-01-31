package com.dev.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@ExtendWith(MockitoExtension.class)
public class LambdaTest2 {

    @Test
    void lambda() {
        /**
         * 하지만 이 코드는 compile단계에서부터 error가 발생하게 됩니다.
         * labmda 안에서는 final변수, effectively final변수만 사용 가능합니다.
         */
        /**
        int listCount = 0;
        List<Integer> numList = Arrays.asList(1, 2, 3);

        numList.stream().forEach(integer -> {
            listCount++;
            numList.remove(0);
        });

        System.out.println(listCount);
         */

        AtomicInteger listCount = new AtomicInteger();
        List<Integer> numList = Arrays.asList(1, 2, 3);

        numList.stream().forEach(integer -> {
            listCount.getAndIncrement();
            numList.remove(0);
        });

        System.out.println(listCount.get());
    }
}
