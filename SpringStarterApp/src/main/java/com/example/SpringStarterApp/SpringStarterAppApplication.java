package com.example.SpringStarterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterAppApplication {


    public static void main(String[] args) {
        var context = SpringApplication.run(SpringStarterAppApplication.class, args);

//		var byName = context.getBean("getCityName");
//		System.out.println(byName);
//
//		var byName2 = context.getBean("getFlowerName");
//		System.out.println(byName2);
//
//		var byName3 = context.getBean("getCurrentTime");
//		System.out.println(byName3);
//
//		var byName4 = context.getBean("getBook");
//		System.out.println(byName4);
//
		var byName5 = context.getBean("getComputer");
		System.out.println(byName5);

		var byName6 = context.getBean("getProfile");
		System.out.println(byName6);

	}


}
