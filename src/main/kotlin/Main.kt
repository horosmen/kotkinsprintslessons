package org.example

import kotlin.random.Random

fun main() {

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



    val randomNumberList = listOf(Random.nextInt(0, 43), Random.nextInt(0, 43), Random.nextInt(0, 43))
    println("Введите ваши 3 числа: ")
    val numberUserOne = readln().toInt()
    val numberUserTwo = readln().toInt()
    val numberUserThree = readln().toInt()
    val randomNumberListUser = listOf(numberUserOne, numberUserTwo, numberUserThree)
    val winNumber = randomNumberList.intersect(randomNumberListUser).size
    when {
        winNumber == 3 -> println("Вы выиграли джекпот!")
        winNumber == 2 -> println("Вы угадали 2 числа и выиграли приз!")
        winNumber == 1 -> println("Вы угадали 1 число и выиграли утешительный приз!")
        else -> println("Вы ничего не угадали:(!")

    }

    println("Загаданные числа: $randomNumberList ")
}
