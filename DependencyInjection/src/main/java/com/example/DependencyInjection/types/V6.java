package com.example.DependencyInjection.types;

import com.example.DependencyInjection.cars.Engine;
import org.springframework.stereotype.Component;


@Component("V6Engine")
public class V6 implements Engine {
    public String type() {
        return "V6 designed by Brad";
    }

}
