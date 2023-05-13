package com.onlyjavatech.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody  //when we do not return web page from controller
public class MainController {
    @RequestMapping("/")
    public String home(){
        System.out.println("This is home page");
        return "home";
    }
    @RequestMapping("/contact")
    public String contact(){
        System.out.println("This is contact page");
        return "contact";
    }
}
