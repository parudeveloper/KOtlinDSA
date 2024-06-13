package com.exampleone120624

fun Int.maxOfThreeNumbers(num2: Int, num3: Int): Int {
    var max = this
    if (num2 > max) {
        max = num2
    }
    if (num3 > max) {
        max = num3
    }
    return max
}

fun main() {
    println("Enter three numbers:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    val greatest = num1.maxOfThreeNumbers(num2, num3)
    println("The greatest of the three numbers is: $greatest")
}