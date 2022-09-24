package com.example.domain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class WebApplication

fun main(args: Array<String>) {
	runApplication<WebApplication>(*args)
}
