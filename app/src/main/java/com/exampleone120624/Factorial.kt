package com.exampleone120624

fun factorial(n: Int): Long {
    if (n == 0 || n == 1) {
        return 1L
    }
    var result = 1L

    for (i in 1..n) {
        result *= i.toLong()
    }
    return result
}

fun main() {
    println("Enter a non-negative number: ")
    val number = readln().toInt()

    if (number < 0) {
        println("Factorial is not defined for negative numbers.")
    } else {
        val result = factorial(number)
        println("Factorial of $number is $result")
    }
}