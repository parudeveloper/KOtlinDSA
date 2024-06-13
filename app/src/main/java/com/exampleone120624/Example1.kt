package com.exampleone120624

fun main() {
    println("Enter name: ");
    val str = readln()

    var isWord = false
    var wordCount = 0

    for (char in str) {
        if (char != ' ' && char != '\n') {
            if (!isWord) {
                wordCount++
                isWord = true
            }
        } else {
            isWord = false
        }
    }


    println("Number of words in the text: $wordCount")
}