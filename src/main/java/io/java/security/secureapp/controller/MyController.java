package io.java.security.secureapp.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Author: Umapada Manna
 * Date: 11/Sep/2022
 */
@RestController
@RequestMapping("/")
public class MyController {

    /**
     * hello method will return simple text, if properly authenticated
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello From Spring Boot";
    }

}
