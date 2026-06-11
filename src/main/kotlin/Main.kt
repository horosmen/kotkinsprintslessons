package org.example

fun main() {
    val dayNumber = 5
    val isEvenDay = dayNumber % 2 == 0

    println(
        """
        Упражнения для рук: ${!isEvenDay}
        Упражнения для ног: $isEvenDay
        Упражнения для спины: $isEvenDay
        Упражнения для пресса: ${!isEvenDay}"""
    )
}
