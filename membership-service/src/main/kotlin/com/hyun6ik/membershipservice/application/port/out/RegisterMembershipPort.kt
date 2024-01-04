package com.hyun6ik.membershipservice.application.port.out

import com.hyun6ik.membershipservice.adapter.out.persistence.MembershipJpaEntity
import com.hyun6ik.membershipservice.domain.Membership

interface RegisterMembershipPort {

    fun createMembership(
        membershipName: Membership.MembershipName,
        membershipEmail: Membership.MembershipEmail,
        membershipAddress: Membership.MembershipAddress,
        membershipIsValid: Membership.MembershipIsValid,
        membershipIsCorp: Membership.MembershipIsCorp,
    ): MembershipJpaEntity
}