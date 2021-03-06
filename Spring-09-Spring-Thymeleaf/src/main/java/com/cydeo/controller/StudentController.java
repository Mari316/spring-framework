package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") // - CLASS LEVEL WE CANNOT DO IT!!!!!!! use @RequestMapping
public class StudentController {

   // @RequestMapping("/register")  - line below is doing the same mapping
    @GetMapping("/register")
    public String register (Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
  //  @RequestMapping("/welcome")
  @GetMapping("/welcome")
    public String info(){
        return "student/welcome";
    }

}
