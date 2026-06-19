package org.example

fun main() {
    println("Пожалуйста задайте таймеру количество секунд: ")
    val input = readlnOrNull()?.toIntOrNull()

    if (input == null) {
        println("Ошибка: введите число")
        return
    }

    if (input <= 0) {
        println("Введите число больше 0")
        return
    }

    var count = input

    while (count > 0) {
        println("Осталось секунд: $count")

        Thread.sleep(1000)   // пауза 1 секунда (1000 мс)

        count--
    }
    println("Время вышло")

}