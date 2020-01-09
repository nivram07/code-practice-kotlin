package com.example

import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression.")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(5))))
}
