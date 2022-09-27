package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LabController {

@RequestMapping("/lab")
    public String labList( Model model){

    model.addAttribute("firstLab","lab-00-Cupling");
    model.addAttribute("secondLab", "lab-01-IoC");
    model.addAttribute("thirdLab","lab-02-DI");
    model.addAttribute("thirdLab","lab-03-Springboot");
    model.addAttribute("fourthLab","lab-04-ThymeLeaf");

    return "lab/lab-list";


    }




}
