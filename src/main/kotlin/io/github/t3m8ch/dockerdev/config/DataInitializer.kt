package io.github.t3m8ch.dockerdev.config

import io.github.t3m8ch.dockerdev.entities.ProductEntity
import io.github.t3m8ch.dockerdev.repositories.ProductRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal
import javax.annotation.PostConstruct

@Component
class DataInitializer(private val productRepo: ProductRepository) {
    @PostConstruct
    @Transactional
    fun initData() {
        productRepo.saveAll(listOf(
            ProductEntity(title = "Iphone", price = BigDecimal("50000.00")),
            ProductEntity(title = "Oneplus", price = BigDecimal("30000.00")),
            ProductEntity(title = "Pixel", price = BigDecimal("40000.00")),
        ))
    }
}
