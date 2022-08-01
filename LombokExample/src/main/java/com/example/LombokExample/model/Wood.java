package com.example.LombokExample.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Wood {


    private Long id;
    private boolean coniferous;
    private String color;
    private String name;
    private int age;
    private int weight;
    private boolean artificial;
    private boolean soft;

}
