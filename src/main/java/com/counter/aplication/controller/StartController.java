package com.counter.aplication.controller;

import com.counter.aplication.entities.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {





    @GetMapping
    public String home1(Model model){
        model.addAttribute(new Counter());
        return "index";
    }

    @PostMapping
    public  String home2(@ModelAttribute Counter counter, Model model){
        
        model.addAttribute(new Counter());
        return "index";
    }


}
