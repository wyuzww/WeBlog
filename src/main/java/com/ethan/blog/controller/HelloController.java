package com.ethan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hello world!";
    }
}
