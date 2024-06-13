package com.exampleone120624

fun findFirstPairWithSum(arr: IntArray, targetSum: Int): Pair<Int, Int> {
    for (i in arr.indices) {
        val complement = targetSum - arr[i]
        for (j in i + 1 until arr.size) {
            if (arr[j] == complement) {
                return Pair(i, j)
            }
        }
    }
    return Pair(-1, -1)
}

fun main() {
    println("Enter the size of the array: ")
    val n = readln().toInt()

    val arr = IntArray(n)
    println("Enter the elements of the array: ")
    for (i in 0 until n) {
        arr[i] = readln().toInt()
    }

    println("Enter the target sum: ")
    val targetSum = readln().toInt()

    val (index1, index2) = findFirstPairWithSum(arr, targetSum)

    if (index1 == -1) {
        println("No pair found with sum $targetSum")
    } else {
        println("First pair with sum $targetSum: elements at indices $index1 and $index2")
    }
}