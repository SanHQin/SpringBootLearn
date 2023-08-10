package com.itgt.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("getById is running.....");
        return "getById is running.....";
    }
}
