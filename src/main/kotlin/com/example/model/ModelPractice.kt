package com.example.model

fun main(args: Array<String>) {
    val me = Person("Marvin", "Flores", 32)
    val bus1 = Bus("red", listOf(me))
    val bus2 = Bus("red", listOf(me))

    val buses = setOf(bus1, bus2)
    assert(buses.size == 1)
}