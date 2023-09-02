package com.tm.todokmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform