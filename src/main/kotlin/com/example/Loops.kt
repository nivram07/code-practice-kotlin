package com.example

import java.util.*

fun main(args: Array<String>) {

    for (i in 0..99)
        print("$i ")
    val size = 100
    println()
    for (i in 0 until size step 2) {
        print("$i ")
    }

    val charBinaryMap = TreeMap<Char, String>()
    for (i in 'A'..'Z')
        charBinaryMap[i] = Integer.toBinaryString(i.toInt())

    println()
    for ((key, value) in charBinaryMap)
        println("$key = $value")

    println()
    var index = 0
    while (index < 100) {
        print("$index ")
        index++
    }
}