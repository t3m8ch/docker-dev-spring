package io.github.t3m8ch.dockerdev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerDevApplication

fun main(args: Array<String>) {
    runApplication<DockerDevApplication>(*args)
}
