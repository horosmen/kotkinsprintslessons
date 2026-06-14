package org.example

fun main() {
    val randomNumberOne: Int = (0..10).random()
    val randomNumberTwo: Int = (0..10).random()
    val correctAnswer = randomNumberOne + randomNumberTwo
    println("Решите пример: $randomNumberOne + $randomNumberTwo = ")
    val enteredNumber = readln().toInt()

    if (correctAnswer == enteredNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}