package com.example.web.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/shopping/")
class UserController {

    @GetMapping
    fun home(model: Model): String {
        return "index"
    }

    @GetMapping("/users")
    fun getListOfUsers(model: Model): String {
        return "users"
    }

}