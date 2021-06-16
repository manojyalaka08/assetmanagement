package com.capgemini.assetmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AssetManagement {

    @GetMapping(value = "/hello", produces = "application/json")
    public String helloWorld(){
        return "Helloworld";
    }
}
