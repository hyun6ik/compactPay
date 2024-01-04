package com.hyun6ik.membershipservice.adapter.out.persistence

import com.hyun6ik.membershipservice.domain.Membership
import org.springframework.stereotype.Component

@Component
class MembershipMapper {

    fun mapToDomainEntity(
        membershipJpaEntity: MembershipJpaEntity
    ): Membership {
        return Membership.create(
            Membership.MembershipId(membershipJpaEntity.membershipId!!),
            Membership.MembershipName(membershipJpaEntity.name),
            Membership.MembershipEmail(membershipJpaEntity.email),
            Membership.MembershipAddress(membershipJpaEntity.address),
            Membership.MembershipIsValid(membershipJpaEntity.isValid),
            Membership.MembershipIsCorp(membershipJpaEntity.isCorp),
        )

    }
}