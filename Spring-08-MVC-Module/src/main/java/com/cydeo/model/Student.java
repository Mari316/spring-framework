package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;


    @Data
    @AllArgsConstructor
    public class Student {  // this class is NOT dependency to any other class so NO @Component ->
        // go to StudentController and create an object from this class
        private int id;
        private String firstName;
        private String lastName;
    }

