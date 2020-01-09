package com.example

fun main(args: Array<String>) {

    val set1 = setOf(1, 2 ,3)
    val map1 = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val list1 = listOf('A', 'B', 'C')
    val unsortedList = listOf(3, 2, 1, 4)

    println(set1.javaClass)
    println(set1)
    println(map1.javaClass)
    println(map1)

    println(list1.javaClass)
    println(list1)

    val sortedList = unsortedList.sorted()
    println(sortedList)

}