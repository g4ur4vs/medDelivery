package com.mdcvv.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *Created by gaurav13.singh on Dec, 2020
 **/

@RestController
class Controller {

    @GetMapping("/test")
    fun test(): String {
        return "Hello"
    }
}