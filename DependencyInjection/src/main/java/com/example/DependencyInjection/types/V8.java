package com.example.DependencyInjection.types;

import com.example.DependencyInjection.cars.Engine;
import org.springframework.stereotype.Component;

@Component("V8Engine")
public class V8 implements Engine {
    public String type() {
        return "V8 designed by Vytautas";
    }
}
