package com.hyun6ik.membershipservice.application.port.`in`

class RegisterMembershipCommand(
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean,
)