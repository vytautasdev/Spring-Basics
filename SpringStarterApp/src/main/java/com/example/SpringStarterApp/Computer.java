package com.example.SpringStarterApp;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Computer {

    @Size(min = 4, max = 10)
    private String brand;

    @Max(2)
    private int warranty;

    @Min(8)
    @NotNull(message = "Memory cannot be less than 8 GB, otherwise your computer will struggle to perform basic tasks...")
    private int minRam;

}

