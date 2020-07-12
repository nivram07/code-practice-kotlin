package com.example.model

private class SamplePrivateClass(val property1: String) {

}

fun main(args: Array<String>) {
    val sample = SamplePrivateClass("hello")
    println(sample.property1)
}