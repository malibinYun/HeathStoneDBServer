package com.malibin.hearthstone.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/home")
    fun welcomeRaspberryPi(): String {
        return "Welcome My Personal Raspberry Pi Server"
    }
}
