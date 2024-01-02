package com.hyun6ik.membershipservice.domain

class Membership private constructor(
    val membershipId: String,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val aggregateIdentifier: String
) {
    companion object {
        fun generateMember(
            membershipId: MembershipId,
            membershipName: MembershipName,
            membershipEmail: MembershipEmail,
            membershipAddress: MembershipAddress,
            membershipIsValid: MembershipIsValid,
            membershipIsCorp: MembershipIsCorp
        ) = Membership(
            membershipId.membershipId,
            membershipName.nameValue,
            membershipEmail.emailValue,
            membershipAddress.addressValue,
            membershipIsValid.isValidValue,
            membershipIsCorp.isCorp,
        )
    }

    data class MembershipId(val membershipId: String)

    data class MembershipName(val nameValue: String)

    data class MembershipEmail(val emailValue: String)

    data class MembershipAddress(val addressValue: String)

    data class MembershipIsValid(val isValidValue: Boolean)

    data class MembershipIsCorp(val isCorp: String)
}
