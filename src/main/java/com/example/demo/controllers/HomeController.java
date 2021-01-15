package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HomeController {

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

//    Test commit; commits not showing on github

}
