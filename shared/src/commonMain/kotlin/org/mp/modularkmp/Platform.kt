package org.mp.modularkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform