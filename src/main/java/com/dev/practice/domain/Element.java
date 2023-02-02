package com.dev.practice.domain;

import lombok.Data;

@Data
public class Element<E> {
    private E id;
    private String password;
}
