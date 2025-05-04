package org.example.chapter3.code

fun main() {
    val set = setOf(1, 7, 53)
    val list = listOf(1, 7, 53)
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println("set: ${set.javaClass}")
    println("list: ${list.javaClass}")
    println("map: ${map.javaClass}")
}