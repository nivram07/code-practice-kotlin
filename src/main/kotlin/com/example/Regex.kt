package com.example

fun main(args: Array<String>) {
    isEmailAddress("marvin_flores.bandal@gmail.com")
    isEmailAddress("_")
    isEmailAddress("_hello@g2.com")

}

fun isEmailAddress(str: String) : Boolean {
    val emailRegex = """[a-zA-Z0-9][a-zA-Z0-9._]{0,20}@[a-z0-9]{3,10}.[a-z]{2,3}""".toRegex()
    val matchResult = emailRegex.matchEntire(str)
    if (matchResult != null) {
        println("$str is a valid email address")
        return true
    }

    println("$str is not a valid email address")
    return false
}