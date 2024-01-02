package com.hyun6ik.compactpay

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/ping")
    fun pong(): String {
        return "pong"
    }
}