package org.example

fun main() {
    println("Задайте количество секунд: ")
    val userInputSeconds = readln().toIntOrNull()
    if (userInputSeconds != null && userInputSeconds > 0) {
        for (i in userInputSeconds downTo 1) {
            println("Осталось: $i сек")
            Thread.sleep(1000)
        }
    } else {
        println("Ошибка ввода.")
        return
    }

    println("Время вышло")
}
