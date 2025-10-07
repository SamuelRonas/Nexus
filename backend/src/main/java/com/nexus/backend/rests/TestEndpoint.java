package com.nexus.backend.rests;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@SpringBootApplication
public class TestEndpoint {
    @GetMapping
    public String getTest(){
        return "test OK";
    }
}
