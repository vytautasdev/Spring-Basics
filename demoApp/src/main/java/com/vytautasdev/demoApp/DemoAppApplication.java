package com.vytautasdev.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAppApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DemoAppApplication.class, args);

        var byName1 = context.getBean("greet");
        var byType2 = context.getBean(String.class);
        var byBoth3 = context.getBean("greet", String.class);

        System.out.println(byName1);
//        System.out.println(byType2);
//        System.out.println(byBoth3);


        var byName = context.getBean("showMovieName");
//        var byType = context.getBean(String.class);
//        var byBoth = context.getBean("showMovieName", String.class);

        System.out.println(byName);
//        System.out.println(byType);
//        System.out.println(byBoth);

    }



}
