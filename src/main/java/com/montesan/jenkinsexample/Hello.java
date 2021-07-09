package com.montesan.jenkinsexample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello "+name;
    }
}