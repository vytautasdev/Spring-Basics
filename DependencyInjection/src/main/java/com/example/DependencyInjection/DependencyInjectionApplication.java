package com.example.DependencyInjection;

import com.example.DependencyInjection.interfaces.Notebook;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DependencyInjectionApplication {


    public static void main(String[] args) {
//        var context = SpringApplication.run(DependencyInjectionApplication.class, args);


        var context = new AnnotationConfigApplicationContext(AppConfig.class);
//        var myCar = context.getBean("MyVolvo", Car.class);
//        var yourCar = context.getBean("MyBMW", Car.class);
//
//        System.out.println(myCar.spec());
//        System.out.println(yourCar.spec());

        var msi = context.getBean("msiNotebook", Notebook.class);
        var dell = context.getBean("dellNotebook", Notebook.class);

        System.out.println(msi.spec());
        System.out.println(dell.spec());
    }


}
