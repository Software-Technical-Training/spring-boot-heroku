package com.stti.herokudemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class ProblemMvcController {

    @GetMapping("/problems")
    public String problems(Model model){
        List<String> problems = new ArrayList<>();
        problems.add("Problem 1");
        problems.add("Problem 2");
        problems.add("Problem 3");

        model.addAttribute("problems",problems);
        return "problems";
       
    }
    
}
