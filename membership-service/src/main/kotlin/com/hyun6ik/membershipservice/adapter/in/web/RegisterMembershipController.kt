package com.hyun6ik.membershipservice.adapter.`in`.web

import com.hyun6ik.common.WebAdapter
import com.hyun6ik.membershipservice.application.port.`in`.RegisterMembershipCommand
import com.hyun6ik.membershipservice.application.port.`in`.RegisterMembershipUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase
) {

    @PostMapping("membership/register")
    fun registerMembership(
        @RequestBody req: RegisterMembershipReq
    ) {

        val command = RegisterMembershipCommand(
            name = req.name,
            email = req.email,
            address = req.address,
            isCorp = req.isCorp,
            isValid = true
        )

        registerMembershipUseCase.registerMembership(command)

    }
}