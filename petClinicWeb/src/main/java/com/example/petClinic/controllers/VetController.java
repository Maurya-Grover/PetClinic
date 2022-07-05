package com.example.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/index.html","/vets/index"})
    public String listVets(){
        return "vets/index";
        // the first part has to be same name as directory name in templates directory
        // so that appropriate file can be fetched and served
    }
}