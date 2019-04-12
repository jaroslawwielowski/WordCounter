package com.counter.aplication.controller;

import com.counter.aplication.entities.Counter;
//import com.counter.aplication.service.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {
//    public StartController(CounterService counterService) {
//        this.counterService = counterService;
//    }
//
//    private final CounterService counterService;


    @GetMapping(value = "/")
    public String home1(Model model){
        model.addAttribute(new Counter());
        return "index";
    }

    @PostMapping(value = "/")
    public  String home2(@ModelAttribute Counter counter, Model model){
        model.addAttribute(new Counter());
        return "index";
    }


}
