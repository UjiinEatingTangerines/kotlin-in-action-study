package org.example.chapter2.KotlinBasic.examples.enumClass

enum class Color (
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); // <- 여기에 반드시 세미콜론을 사용해야한다.

    fun rgb() = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is ${rgb()}")
}

fun main() {
    println(Color.BLUE.rgb())
    Color.GREEN.printColor()
}