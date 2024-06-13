package com.exampleone120624

fun Double.toPowerWithLoop(y: Int): Double {
    if (y == 0) {
        return 1.0
    }
    var result = this
    for (i in 1 until y) {
        result *= this
    }
    return result
}

fun main() {
    println("Enter the base number (x): ")
    val x = readln().toDouble()

    println("Enter the non-negative exponent (y): ")
    val y = readln().toInt()

    if (y < 0) {
        println("Exponent cannot be negative.")
    } else {
        val result = x.toPowerWithLoop(y)
        println("$x raised to the power of $y is: $result")
    }
}