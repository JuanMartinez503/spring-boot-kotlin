package io.juanmartinez.learning

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello(): String {
        var number = 1
        var number2 = 2
        var number3 = 3
        var answer = number + number2 + number3
        return "Hello, World! $answer"
    }
}