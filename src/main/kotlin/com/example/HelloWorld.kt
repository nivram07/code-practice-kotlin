package com.example

import com.example.model.Person


fun main(args: Array<String>) {
    println("Hello World!")

    val marvin = Person("Marvin", "Flores", 31)
    println(testIfBlock(2))
    println(marvin)
}
fun testIfBlock(num: Int): Int = if (num == 1) num else 0

fun evalIf(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            evalIf(e.right) + evalIf(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

