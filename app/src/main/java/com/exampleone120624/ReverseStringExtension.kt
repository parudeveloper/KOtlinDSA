package com.exampleone120624

fun String.isPalindromeUsingLoop(): Boolean {
    val mid = this.length / 2

    for (i in 0 until mid) {
        if (this[i] != this[this.lastIndex - i]) {
            return false
        }
    }
    return true
}

fun main() {
    println("Enter name: ");
    val str = readln()

    println("$str is palindrome: ${str.isPalindromeUsingLoop()}")
}