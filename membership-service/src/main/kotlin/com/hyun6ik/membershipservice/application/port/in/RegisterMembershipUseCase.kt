package com.hyun6ik.membershipservice.application.port.`in`

import com.hyun6ik.common.UseCase
import com.hyun6ik.membershipservice.domain.Membership

@UseCase
interface RegisterMembershipUseCase {

    fun registerMembership(command: RegisterMembershipCommand): Membership
}