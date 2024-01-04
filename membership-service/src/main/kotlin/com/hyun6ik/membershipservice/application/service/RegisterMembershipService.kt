package com.hyun6ik.membershipservice.application.service

import com.hyun6ik.membershipservice.adapter.out.persistence.MembershipMapper
import com.hyun6ik.membershipservice.application.port.`in`.RegisterMembershipCommand
import com.hyun6ik.membershipservice.application.port.`in`.RegisterMembershipUseCase
import com.hyun6ik.membershipservice.application.port.out.RegisterMembershipPort
import com.hyun6ik.membershipservice.domain.Membership
import org.springframework.stereotype.Service

@Service
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort,
    private val membershipMapper: MembershipMapper,
) : RegisterMembershipUseCase{
    override fun registerMembership(
        command: RegisterMembershipCommand
    ): Membership {
        val membershipJpaEntity = registerMembershipPort.createMembership(
            membershipName = Membership.MembershipName(command.name),
            membershipEmail = Membership.MembershipEmail(command.email),
            membershipAddress = Membership.MembershipAddress(command.address),
            membershipIsValid = Membership.MembershipIsValid(command.isValid),
            membershipIsCorp = Membership.MembershipIsCorp(command.isCorp),
        )

        return membershipMapper.mapToDomainEntity(membershipJpaEntity)
    }
}