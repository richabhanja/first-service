package com.first.microservice.first_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/") public String health()
    {
        return "Hello Geeks And Welcome to GeekForGeeks !!!";
    }

    @GetMapping("/test") public String test()
    {
        return "Hello Geeks And Welcome to GeekForGeeks !!!";
    }

    @GetMapping("/test1") public String test1()
    {
        return "Hello Geeks And Welcome to GeekForGeeks !!!";
    }
}
