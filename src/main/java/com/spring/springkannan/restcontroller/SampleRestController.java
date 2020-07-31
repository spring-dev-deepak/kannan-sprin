package com.spring.springkannan.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleRestController {

    @GetMapping("/helloworld")
    public  String hello(){
        return "Hello World";
    }
}
