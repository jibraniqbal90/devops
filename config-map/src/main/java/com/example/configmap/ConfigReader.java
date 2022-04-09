package com.example.configmap;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cm")
@Getter
@Setter
public class ConfigReader {

    private String valueOne;
    private String valueTwo;
    private String htmlContent;

}
