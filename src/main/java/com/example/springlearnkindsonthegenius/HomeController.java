package com.example.springlearnkindsonthegenius;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="/home")
    public static String welcome() {
        return "index";
    }
}
