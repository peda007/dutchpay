package im.toss.career.dutchpay.controller

import im.toss.career.dutchpay.dto.DutchRequestDto
import im.toss.career.dutchpay.service.DutchPayService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/dutch")
class DutchPayRestController(
    private val dutchPayService: DutchPayService
) {

    @PostMapping
    fun dutch(
        @RequestBody dutchRequestDto: DutchRequestDto
    ) {
        dutchPayService.pay(
            cost = dutchRequestDto.cost,
            phones = dutchRequestDto.phones
        )
    }
}