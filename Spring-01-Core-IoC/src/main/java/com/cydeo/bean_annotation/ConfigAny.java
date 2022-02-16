package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {
    //in configuration  we have only classes like String etc. or any POJO we created

    @Bean
    String str(){
         return "Developer";
    }
    @Bean
    Integer number(){
        return 100;
    }

}
