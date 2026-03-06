package org.mp.modularkmp.di

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform