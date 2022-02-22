package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Java {
    // Field Injection
    //  @Autowired
    // OfficeHours officeHours;


    // constructor injection

    OfficeHours officeHours;

  //  @Autowired // IF one constructor no need to write @Autowired or @AllArgsConstructor for everithing
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }



    public void getTeachingHours(){
        System.out.println("Weekly teaching hours -  " + (20 + officeHours.getHours()));
    }
}

