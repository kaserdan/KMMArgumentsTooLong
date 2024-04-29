package com.example.argumentstoolong

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform