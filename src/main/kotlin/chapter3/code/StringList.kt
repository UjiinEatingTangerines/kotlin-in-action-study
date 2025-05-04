package org.example.chapter3.code

fun main() {
    val strings = listOf("first", "second", "fourteenth")

    val last = strings.last()
    println("last string: $last")

    println(strings.shuffled())

    val numbers = setOf(1, 14, 2)
    println("numbers sum: ${numbers.sum()}")
}