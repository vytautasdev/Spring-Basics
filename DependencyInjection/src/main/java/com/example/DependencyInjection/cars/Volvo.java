package com.example.DependencyInjection.cars;

import com.example.DependencyInjection.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("MyVolvo")
public class Volvo implements Car {

    @Autowired
    @Qualifier("V6Engine")
    Engine eng;

    @Override
    public String spec() {
        return "This is SEDAN with engine type as: " + eng.type();
    }
}
