package io.github.t3m8ch.dockerdev.dto

import java.math.BigDecimal

data class ProductOutDTO(
    val id: Long,
    val title: String,
    val price: BigDecimal,
)
