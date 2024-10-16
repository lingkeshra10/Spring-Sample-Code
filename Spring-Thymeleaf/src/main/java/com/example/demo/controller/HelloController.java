package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    // need controller method to show initial HTML form

    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to read form data and add the data to the modal
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest httpServletRequest, Model modal){

        //read the request parameter from the html form
        String theName = httpServletRequest.getParameter("studentName");

        //contact the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Hello: " + theName + "!";

        //add the message to the modal
        modal.addAttribute("message", result);

        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormV3(@RequestParam("studentName") String theName, Model modal){

        //contact the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "YO Whatsupp: " + theName + "!";

        //add the message to the modal
        modal.addAttribute("message", result);

        return "helloworld";
    }
}
