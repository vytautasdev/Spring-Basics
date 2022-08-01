package com.vytautasdev.MyFirstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringAppApplication {

    public static void main(String[] args) {


        var context = SpringApplication.run(MyFirstSpringAppApplication.class, args);

        var byName = context.getBean("displayCityName");
        System.out.println(byName);

        var byName2 = context.getBean("displayFlowerName");
        System.out.println(byName2);

        var byName3 = context.getBean("displayCurrentTime");
        System.out.println(byName3);
    }

}
