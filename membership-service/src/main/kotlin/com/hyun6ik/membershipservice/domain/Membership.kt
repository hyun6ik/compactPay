package com.hyun6ik.membershipservice.domain

class Membership private constructor(
    val membershipId: Long,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean,
) {
    companion object {
        fun create(
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
            membershipIsCorp.isCorpValue,
        )
    }

    data class MembershipId(val membershipId: Long)

    data class MembershipName(val nameValue: String)

    data class MembershipEmail(val emailValue: String)

    data class MembershipAddress(val addressValue: String)

    data class MembershipIsValid(val isValidValue: Boolean)

    data class MembershipIsCorp(val isCorpValue: Boolean)
}
