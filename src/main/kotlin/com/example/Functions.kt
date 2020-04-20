package com.example

// example of an extension function
fun String.addYay(): String = "$this yay"

fun main(args: Array<String>) {
    println("wow".addYay())
    println(alphabet())
}

fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append("$letter ")
    }
    append("\nNow I know my ABC!")
    toString()
}