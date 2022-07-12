package io.github.t3m8ch.dockerdev

import io.github.t3m8ch.dockerdev.dto.ProductOutDTO
import io.github.t3m8ch.dockerdev.entities.ProductEntity

fun ProductEntity.mapToOutDTO() = ProductOutDTO(id!!, title!!, price!!)
