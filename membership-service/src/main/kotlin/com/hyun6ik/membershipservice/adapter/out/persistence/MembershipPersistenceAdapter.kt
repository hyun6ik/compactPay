package com.hyun6ik.membershipservice.adapter.out.persistence

import com.hyun6ik.common.PersistenceAdapter
import com.hyun6ik.membershipservice.application.port.out.RegisterMembershipPort
import com.hyun6ik.membershipservice.domain.Membership

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: MembershipRepository
) : RegisterMembershipPort {
    override fun createMembership(
        membershipName: Membership.MembershipName,
        membershipEmail: Membership.MembershipEmail,
        membershipAddress: Membership.MembershipAddress,
        membershipIsValid: Membership.MembershipIsValid,
        membershipIsCorp: Membership.MembershipIsCorp
    ): MembershipJpaEntity {
        return membershipRepository.save(MembershipJpaEntity(
            name = membershipName.nameValue,
            email = membershipEmail.emailValue,
            address = membershipAddress.addressValue,
            isValid = membershipIsValid.isValidValue,
            isCorp = membershipIsCorp.isCorpValue,
        ))
    }
}