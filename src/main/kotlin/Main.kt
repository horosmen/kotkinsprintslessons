package org.example

fun main() {
    val randomNumberOne: Int = (0..10).random()
    val randomNumberTwo: Int = (0..10).random()
    val verificationNuber = randomNumberOne + randomNumberTwo
    println("Решите пример: $randomNumberOne + $randomNumberTwo = ")
    val enteredNumber = readln().toInt()

    if (verificationNuber == enteredNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}