package com.dev.practice.domain;

import lombok.Data;

@Data
public class Type<T> {
    private T id;
    private String password;
}
