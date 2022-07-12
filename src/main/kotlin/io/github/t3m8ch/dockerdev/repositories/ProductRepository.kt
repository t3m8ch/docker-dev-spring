package io.github.t3m8ch.dockerdev.repositories

import io.github.t3m8ch.dockerdev.entities.ProductEntity
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<ProductEntity, Long>
