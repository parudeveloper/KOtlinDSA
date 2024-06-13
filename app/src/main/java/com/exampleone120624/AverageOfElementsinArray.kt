package com.exampleone120624

fun main() {
    println("Enter the number of elements you want in the array: ")
    val n = readln().toInt()

    val arr = IntArray(n)

    for (i in 0 until n) {
       arr[i] = readln().toInt()
    }

    // Calculate the sum of the elements
    var sum = 0
    for (element in arr) {
        sum += element
    }

    // Calculate the average (usingtoDouble to convert to Double for division)
    val average = sum.toDouble() / arr.size

    // Display the sum and average
    println("Sum of elements: $sum")
    println("Average of elements: $average")
}