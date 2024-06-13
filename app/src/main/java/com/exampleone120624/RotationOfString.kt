package com.exampleone120624

fun isRotation(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }else{
        return (str1 + str1).contains(str2)
    }
}

fun main() {
    println("Enter the first string: ")
    val str1 = readln()

    println("Enter the second string: ")
    val str2 = readln()

    if (isRotation(str1, str2)) {
        println("$str1 is a rotation of $str2")
    } else {
        println("$str1 is not a rotation of $str2")
    }
}