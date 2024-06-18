package com.example.deplo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

    @GetMapping("/devName")
    public String getDevName() {
        return "Claudio";
    }
}
