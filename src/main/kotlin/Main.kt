package org.example

fun main() {
    val winningNumberOne = 15
    val winningNumberTwo = 30
    println("Введите ваше первое число для победы: ")
    val checkNumberOne = readln().toInt()
    println("Введите ваше второе число для победы: ")
    val checkNumberTwo = readln().toInt()
    if (winningNumberOne == checkNumberOne && winningNumberTwo == checkNumberTwo)
        {println("Поздравляем! Вы выиграли главный приз!")}
    else  if (winningNumberOne == checkNumberOne || winningNumberTwo == checkNumberTwo)
        { println("Вы выиграли утешительный приз!")}
    else {
        println("Неудача!")
    }
}