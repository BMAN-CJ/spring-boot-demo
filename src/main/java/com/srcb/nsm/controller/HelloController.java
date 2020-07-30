package com.srcb.nsm.controller;

import com.srcb.nsm.domain.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello(1, String.format("Hello, %s!", name));
    }
}
