package org.example

fun main() {
    println("Задайте количество секунд: ")
    val userInputSeconds = readln().toIntOrNull()
    if (userInputSeconds != null) {
        for (i in userInputSeconds downTo 1) {
            println("Осталось: $i секунд")
            Thread.sleep(1000)
        }
    } else {
        println("Ошибка вы ввели не число.")
        return
    }

    println("Время вышло")
}
