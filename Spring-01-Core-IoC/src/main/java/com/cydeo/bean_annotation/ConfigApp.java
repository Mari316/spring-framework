package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    // creating method that will return bean (instance of FullTime mentor)
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();

    }
    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }
}
