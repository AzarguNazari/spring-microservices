package com.example.web

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApplication : ApplicationRunner {
	override fun run(args: ApplicationArguments?) {
		println("Hello")
	}

}

fun main(args: Array<String>) {
	runApplication<WebApplication>(*args)
}
