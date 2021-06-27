package com.mtk.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";

    }

    @RequestMapping("/test/{path}")
    public String handle02(@PathVariable("path") String path){
        return path;
    }
    @RequestMapping(value = "/getFile", method = RequestMethod.GET)
    public String getFile(@RequestParam("path") String path) {
        // do something

        return path;
    }
}
