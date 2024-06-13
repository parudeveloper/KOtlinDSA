package com.exampleone120624

fun reverseSentence(sentence: String): String {
    val words = sentence.split(" ")

    val reversedWords = words.reversed()
    return reversedWords.joinToString(" ")
}

fun main() {
    println("Enter a sentence: ")
    val sentence = readln()

    val reversedSentence = reverseSentence(sentence)
    println("Reversed sentence: $reversedSentence")
}