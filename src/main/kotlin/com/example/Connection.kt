package com.example

import io.ktor.websocket.*
import java.util.concurrent.atomic.AtomicInteger

class Connection(val session: DefaultWebSocketSession) {
    companion object {
        val lastId = AtomicInteger(0) //estructura de datos segura para subprocesos para el contador.
    }
    val name = "user${lastId.getAndIncrement()}"
}