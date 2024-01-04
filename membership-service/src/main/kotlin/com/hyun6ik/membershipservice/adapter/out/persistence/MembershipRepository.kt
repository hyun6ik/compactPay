package com.hyun6ik.membershipservice.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface MembershipRepository : JpaRepository<MembershipJpaEntity, Long> {
}