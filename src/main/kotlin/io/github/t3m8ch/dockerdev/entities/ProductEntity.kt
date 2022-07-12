package io.github.t3m8ch.dockerdev.entities

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "product")
class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var title: String? = null,

    @Column(nullable = false)
    var price: BigDecimal? = null,
)
