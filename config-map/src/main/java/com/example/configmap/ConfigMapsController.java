package com.example.configmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigMapsController {

    @Autowired
    private ConfigReader reader;

    @GetMapping("/cm-values")
    public String cmValue(){

        return reader.getValueOne()+" "+ reader.getValueTwo();
    }
}
