package com.example

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        val fullName = getFullName()
        println(fullName)
    }
    println ("Running runBlocking...")
    runBlocking {
        coroutineScope {
            val firstNameAsync = async { getFirstName() }
            val lastNameAsync = async { getLastName() }

            println("${firstNameAsync.await()} ${lastNameAsync.await()}!!!")
        }
    }
    println("Hello, ")
    Thread.sleep(2000)
}

suspend fun getFullName(): String {
    val firstName = getFirstName()
    if (firstName == null)
        println("First Name is null")
    else
        println("Got first name, getting last name...")
    val lastName = getLastName()
    return "$firstName $lastName"
}

suspend fun getFirstName(): String? {
    delay(500)
    return "Marvin"
}

suspend fun getLastName(): String? {
    delay(500)
    return "Flores"
}