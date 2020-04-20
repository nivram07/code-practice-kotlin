package com.example

import java.io.File

fun main(args: Array<String>) {
    println(sum(1,2))
    val count = Ref(0)
    val inc = { count.value++ }
    println(count.value)

    run { inc() }
    println(count.value)
    run(inc)
    println(count.value)

    var count2 = 0
    val incCount2 = { count2++ }
    run(incCount2)
    println("count2: $count2")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)

    val sampleList = listOf(1,1,3,4,5,2,2)
    val uniqueList = sampleList.toSet()
    println(uniqueList)

    val file = File("/Users/Marvin/.hiddenDir/make.txt")
    println(file.parentFile)
    println("The file is hidden: " + file.isInsideHiddenDirectory())
}

val sum = { x: Int, y: Int -> x + y }

class Ref<T>(var value: T)

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }


fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}
