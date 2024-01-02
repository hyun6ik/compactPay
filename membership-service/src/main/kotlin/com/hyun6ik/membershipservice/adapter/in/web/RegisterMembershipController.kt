package com.hyun6ik.membershipservice.adapter.`in`.web

import com.hyun6ik.common.WebAdapter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController {

    @GetMapping("ping")
    fun pong() = "pong"
}