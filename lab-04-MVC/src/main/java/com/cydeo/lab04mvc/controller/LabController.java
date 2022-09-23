package com.cydeo.lab04mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

@RequestMapping("/lab")
    public String getLabs( Model model){

        return "welcome/lab";


    }




}
