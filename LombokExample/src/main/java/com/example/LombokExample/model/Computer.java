package com.example.LombokExample.model;

import lombok.*;

@Data
@NoArgsConstructor
public class Computer {

    public int serialNumber;
    public String brand;
    public int ram;
    public int storage;
    public String motherboardType;
    public int price;
    public int warranty;
    public boolean deliveryFees;
    public int screenSize;
    public String color;
    public String series;


}


