package com.example

// example of an extension function
fun String.addYay(): String = "$this yay"

fun main(args: Array<String>) {
    println("wow".addYay())
}
