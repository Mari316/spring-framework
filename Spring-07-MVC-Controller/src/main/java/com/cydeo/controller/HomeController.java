package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // same like @Component, will do mapping.
public class HomeController {


    @RequestMapping("/home") //Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home() {
        return "home.html"; // Its looking in Static package for relevant methods
    }

    @RequestMapping("/welcome") //Return the HTML document name that contains the details we want the browser to display
    public String welcome() {
        return "welcome.html";
    }
}