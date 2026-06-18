package org.example

fun main() {
    println("Пожалуйста задайте таймеру количество секунд: ")
    var count = readlnOrNull()?.toIntOrNull()
    if (count== null){
        println("введите число")
    return }
    val totalSeconds = count
    while (count > 0 && count!= null) {
        Thread.sleep(1000)   // пауза 1 секунда (1000 мс)
        count--
        }
    println("Прошло: $totalSeconds секунд")
}

