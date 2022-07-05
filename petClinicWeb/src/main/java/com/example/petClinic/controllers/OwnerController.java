package com.example.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners","/owner"})
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    // alternate way to have request mappings where  it is known all have a common path
    // with / and without / is treated different and hence both need to be mapped
    public String listOwners() {
        return "owners/index";
    }
}