package com.dev.practice.lamda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
public class Grape {
    private int weight = 0;
    private String color = "";

    public String toString() {
        return "Grape {" +
                "color='" + color + "'" +
                ", weight=" + weight +
                "}";
    }
}
