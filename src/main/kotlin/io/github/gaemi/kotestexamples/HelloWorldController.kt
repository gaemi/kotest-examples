package io.github.gaemi.kotestexamples

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("hello")
    fun hello() = "Hello"

}