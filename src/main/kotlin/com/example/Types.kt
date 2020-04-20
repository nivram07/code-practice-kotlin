package com.example

fun main(args: Array<String>) {

    val byte1: Byte = 24
    println(byte1.toString(radix = 2))

    for (c in byte1.toString(radix = 2))
        print("$c ")

    strLen(null)

}

fun strLen(s: String?): Int = s?.length ?: 0
