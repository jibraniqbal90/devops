package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/call")
    public String call(){
        return "Caller "+ template.getForObject("http://testsvc.dev/test", String.class);
    }

}
