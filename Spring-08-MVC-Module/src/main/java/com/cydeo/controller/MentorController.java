package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // we did it because imagine we have AnotherController with same endpoint  - /list
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("list")   // localhost:8080/mentor/list, we cant say /mentor/list here - should be separate for each method
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";


    }
}
