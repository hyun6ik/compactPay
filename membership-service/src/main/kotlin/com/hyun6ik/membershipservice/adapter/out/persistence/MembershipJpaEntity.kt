package com.hyun6ik.membershipservice.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "membership")
class MembershipJpaEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val membershipId: Long? = null,

    val name: String,
    val address: String,
    val email: String,
    val isValid: Boolean,
    val isCorp: Boolean,
) {
}