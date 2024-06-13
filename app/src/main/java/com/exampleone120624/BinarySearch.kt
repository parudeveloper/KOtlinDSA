package com.exampleone120624

fun main() {
    print("Enter size of array: ")
    val n = readln().toInt()

    val arr = Array<Int> ( n ) { 0 }   // Integer[]

    println("Enter $n elements of array:")
    for( i in 0 until n) {
        arr[i] = readln().toInt()
    }

    println("Enter the element to search: ")
    val searchElement = readLine()!!.toInt()

    val index = binarySearch(arr, searchElement)

    if (index == -1) {
        println("Element is not present in array")
    } else {
        println("Element is present at index $index")
    }
}

fun binarySearch(arr: Array<Int>, x: Int): Int {
    var low = 0
    var high = arr.lastIndex
    var mid: Int

    while (low <= high) {
        mid = (low + high) / 2


        if (arr[mid] == x) {
            return mid
        }


        if (arr[mid] < x) {
            low = mid + 1
        }


        else {
            high = mid - 1
        }
    }


    return -1
}