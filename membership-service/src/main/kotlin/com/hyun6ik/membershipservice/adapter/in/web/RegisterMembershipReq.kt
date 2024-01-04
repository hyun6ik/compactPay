package com.hyun6ik.membershipservice.adapter.`in`.web

data class RegisterMembershipReq (
    val name: String,
    val address: String,
    val email: String,
    val isCorp: Boolean,
)