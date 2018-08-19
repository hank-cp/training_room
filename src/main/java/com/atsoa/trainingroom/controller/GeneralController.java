package com.atsoa.trainingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

    @RequestMapping(value = "/")
    public String index() {
        return "/index";
    }

}
