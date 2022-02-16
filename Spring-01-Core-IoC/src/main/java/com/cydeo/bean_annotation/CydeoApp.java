package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class CydeoApp {   // CONTAINER HERE!
    public static void main(String[] args) {
       // now Spring handling all obj for PT FT mentors  - IoC (can chain configurations, have more than 1)
        ApplicationContext container  = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
       // how to get obj (bean) from container
       FullTimeMentor ft =  container.getBean(FullTimeMentor.class);
       ft.createAccount(); // call method for this bean "Full Time mentor is created"

       ConfigAny print =  container.getBean(ConfigAny.class);
        System.out.println(print.str());// Developer
        System.out.println(print.number());// 100
    }
}
