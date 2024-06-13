package com.exampleone120624

fun main() {


    print("Enter size of array: ")
    val n = readln().toInt()

    val ar = Array<Int> ( n ) { 0 }   // Integer[]

    println("Enter $n elements of array:")
    for( i in 0 until n) {
        ar[i] = readln().toInt()
    }

    var sum = 0
    for (element in ar) {
        sum += element
    }

    val average = sum.toDouble() / ar.size


    println("Sum of elements: $sum")
    println("Average of elements: $average")

}