package com.example

import kotlin.math.sqrt
import kotlin.math.pow

fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
    val pointComparator =  Comparator<IntArray> {
            p1, p2 -> dist(p1) - dist(p2)
    }
    points.sortWith(pointComparator)
    return points.copyOfRange(0, K)
}

fun dist(point: IntArray): Int {
    return sqrt(point[0].toDouble().pow(2) + point[1].toDouble().pow(2)).toInt()
}