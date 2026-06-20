package org.example

fun main() {
    var attempt = 1
    val scores = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val randomElement = scores.random()
    while (true) {
        println("Попытка $attempt: введите число")
        val guess = readln().toInt()
        if (guess == randomElement) {
            println("Это была великолепная игра!")
            break
        }
        println("Неверно, оставшееся количество попыток: ${5 - attempt}")
        attempt++
        if (attempt > 5) {
            println("Было загадано число $randomElement")
            break
        }
    }
}