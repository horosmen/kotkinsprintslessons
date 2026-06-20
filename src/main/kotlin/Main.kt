package org.example

fun main() {

    var attempt = 1
    while (attempt <= 3) {
        val randomNumberOne: Int = (1..9).random()
        val randomNumberTwo: Int = (1..9).random()
        val correctAnswer = randomNumberOne + randomNumberTwo
        println("Решите пример: $randomNumberOne + $randomNumberTwo = ")
        val enteredNumber = readln().toInt()
        if (correctAnswer == enteredNumber) {
            println("Добро пожаловать!")
            break
        }
        attempt++
        continue
    }
    if (attempt > 3) {
        println("Доступ запрещен.")
    }
}