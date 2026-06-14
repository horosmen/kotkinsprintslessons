package org.example

fun main() {
    val verificationFunction = 5 + 9
    val enteredNumber = readln().toInt()

    if (verificationFunction == enteredNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}