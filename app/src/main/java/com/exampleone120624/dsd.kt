package com.exampleone120624

fun main() {
    // program to find number of vowels and consonants for given input string
    println("Enter name: ");
    val str = readln()
    var vCount = 0
    var cCount = 0

    for(ch in str) {
        when(ch) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                vCount++
            }
            in 'a'..'z', in 'A'..'Z' -> {
                cCount++
            }
        }
    }

    println("Number of vowels in input = $vCount")
    println("Number of consonants in input = $cCount")


}