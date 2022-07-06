package com.example.petClinic.controllers;

import com.example.petClinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners","/owner"})
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired // Autowired optional here as well
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    // alternate way to have request mappings where  it is known all have a common path
    // with / and without / is treated different and hence both need to be mapped
    public String listOwners(Model model) {
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}