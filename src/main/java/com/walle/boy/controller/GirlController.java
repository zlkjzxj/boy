package com.walle.boy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

    @RequestMapping("/getgirl")
    public String getAGirl(){
        return "hello";
    }
}
