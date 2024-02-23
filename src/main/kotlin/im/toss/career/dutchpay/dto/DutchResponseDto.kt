package im.toss.career.dutchpay.dto

data class DutchResponseDto(
    val dutchParts: List<DutchPartResponseDto>
)

data class DutchPartResponseDto(
    val phone: String,
    val payment: Long
)