package io.github.t3m8ch.dockerdev.controllers

import io.github.t3m8ch.dockerdev.mapToOutDTO
import io.github.t3m8ch.dockerdev.repositories.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("products")
class ProductController(private val productRepo: ProductRepository) {
    @GetMapping
    fun getAll() = productRepo.findAll().map { it.mapToOutDTO() }
}
