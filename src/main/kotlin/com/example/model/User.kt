package com.example.model

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }
        get() {
            return "$field ..."
        }
}

fun main(args: Array<String>) {
    val user = User("Marvin")
    user.address = "327 Lisa Ct."
    println(user.address)
}