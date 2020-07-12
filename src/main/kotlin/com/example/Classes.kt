package com.example

class Shape {

    val defaultName = "Shape"
    inner class Square(private val name: String?) {
       fun printName() = println(name ?: defaultName)
    }
}

fun main(args: Array<String>) {
    val square = Shape().Square("square")
    square.printName()

    val boss = HeadTeacher("123A", "Marvin")
    println("${boss.nickname}: ${boss.bossId}")

    CarFactory.printBest()

    run { println("hello lambda") }

    println(Vehicle.getName())
}

interface Person {
    val nickname: String
}

open class Teacher(override val nickname: String): Person

class HeadTeacher(bossId: String, nickname: String) : Teacher(nickname) {
    var bossId: String
        get() = "[$field]"
        private set
    init {
        this.bossId = "#$bossId"
    }
}

object CarFactory {
    fun printBest() = println("Toyota")
}

class Vehicle {
    companion object {
        fun getName() = Vehicle.javaClass.canonicalName
    }

    object Loader {

    }

    object  Implementation {

    }
}



