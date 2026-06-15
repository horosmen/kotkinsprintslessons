package org.example

fun main() {
    val winningNumberOne = 15
    val winningNumberTwo = 30
    println("Введите ваше первое число для победы: ")
    val checkNumberOne = readln().toInt()
    println("Введите ваше второе число для победы: ")
    val checkNumberTwo = readln().toInt()
    if (winningNumberOne == checkNumberOne && winningNumberTwo == checkNumberTwo ||
        winningNumberOne == checkNumberTwo && winningNumberTwo == checkNumberOne) {
        println(
            """
            |Поздравляем! Вы выиграли главный приз!
            |Загаданные числа: $winningNumberOne и $winningNumberTwo
        """.trimMargin()
        )
    } else if ((winningNumberOne == checkNumberOne || winningNumberTwo == checkNumberTwo) ||
        (winningNumberOne == checkNumberTwo || winningNumberTwo == checkNumberOne)) {
        println(
            """
            |Вы выиграли утешительный приз!
            |Загаданные числа: $winningNumberOne и $winningNumberTwo
        """.trimMargin()
        )
    } else {
        println(
            """
            |Неудача!
            |Загаданные числа: $winningNumberOne и $winningNumberTwo
        """.trimMargin()
        )
    }
}
