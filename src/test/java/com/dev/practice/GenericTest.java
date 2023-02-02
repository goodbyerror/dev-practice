package com.dev.practice;

import com.dev.practice.domain.Element;
import com.dev.practice.domain.Type;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GenericTest {

    private final String ID = "dalda";
    private final String password = "1234";

    @Test
    void type_test() {
        Type<String> type = new Type<>();
        type.setId(ID);
        type.setPassword(password);

        assertThat(type.getId(), is(ID));
        assertThat(type.getPassword(), is(password));
    }

    void element_test() {
        Element<String> element = new Element<>();
        element.setId(ID);
        element.setPassword(password);

        assertThat(element.getId(), is(ID));
        assertThat(element.getPassword(), is(password));
    }
}
