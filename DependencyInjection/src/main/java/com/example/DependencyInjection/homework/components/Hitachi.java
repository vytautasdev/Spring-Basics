package com.example.DependencyInjection.homework.components;

import com.example.DependencyInjection.homework.notebooks.Hdd;
import org.springframework.stereotype.Component;

@Component("Hitachi")
public class Hitachi implements Hdd {
    public String type() {
        return "HDD manufactured by Western Digital in Prachin Buri, Thailand";
    }
}
