package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// HERE IS AN EXAMPLE OF @RequestParam suitable for search engine requests
@Controller
@RequestMapping("/car")
public class CarController {

@RequestMapping("/info")   //localhost:8080/car/info?make=Honda&year=2010 -> you can change Honda in the browser on whatever
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model){
    model.addAttribute("year",year);
    model.addAttribute("make",make);

        return "car/car-info";
    }


    //@RequestParam is accepting value
    @RequestMapping("/info2") // when call this its empty, will shows "Tesla" or add parameters in the browser http://localhost:8080/car/info2?make=Nisssan
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Tesla") String make, Model model){

        model.addAttribute("make",make);

        return "car/car-info";
    }
    @RequestMapping("/info/{make}/{year}") // localhost:8080/car/info/honda (just change in browser honda)
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){ // can add any, just change template html

    model.addAttribute("make", make);
    model.addAttribute("year", year);
    return "car/car-info";
    }
}
