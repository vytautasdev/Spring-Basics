package com.example.DependencyInjection.homework.components;

import com.example.DependencyInjection.homework.notebooks.Hdd;
import org.springframework.stereotype.Component;

@Component("Toshiba")
public class Toshiba implements Hdd {
    public String type() {
        return "HDD manufactured by Toshiba in Taishi, Japan";
    }
}
