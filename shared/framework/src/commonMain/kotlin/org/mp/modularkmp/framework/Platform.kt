package org.mp.modularkmp.framework

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform