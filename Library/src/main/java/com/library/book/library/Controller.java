package com.library.book.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/")
    public String sayHello(){
        return "<h1>WelCome!!</h1>";    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>WelCome Admin !</h1>";    }
    @GetMapping("/user")
    public String user(){
        return "<h1>WelCome user !</h1>";    }
}
