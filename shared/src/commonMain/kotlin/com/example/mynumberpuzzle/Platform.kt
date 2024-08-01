package com.example.mynumberpuzzle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform