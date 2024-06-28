package com.example.deplo01.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

    @Value("${dev.name}")
    private String devName;

    @GetMapping("/devname")
    public String getDevName() {
        return devName;
    }
}
