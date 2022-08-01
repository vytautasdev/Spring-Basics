package com.example.DependencyInjection.cars;

import com.example.DependencyInjection.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("MyBMW")
public class Bmw implements Car {

    @Autowired
    @Qualifier("V8Engine")
    Engine eng;

    @Override
    public String spec() {
        return "This is SUV with engine type as: " + eng.type();
    }
}
