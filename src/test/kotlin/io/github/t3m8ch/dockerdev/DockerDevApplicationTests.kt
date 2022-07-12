package io.github.t3m8ch.dockerdev

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration

@SpringBootTest
@ContextConfiguration(initializers = [ContextInitializer::class])
class DockerDevApplicationTests {

    @Test
    fun contextLoads() {
    }

}
