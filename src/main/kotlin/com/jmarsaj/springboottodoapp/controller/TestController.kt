package com.jmarsaj.springboottodoapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")    //GET request to URL /test
    fun welcome(): String {
        return "Making sure it works"
    }
}