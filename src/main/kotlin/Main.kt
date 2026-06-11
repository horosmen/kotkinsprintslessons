package org.example

fun main() {
    val dayNomber = 5
    var (isHands, isPress) = Pair(true, true)
    var (isLegs, isBack) = Pair(true, true)
    if (dayNomber % 2 == 0) {
        isHands = !isHands
        isPress = !isPress
        println(
            """
        Упражнения для рук:$isHands

        Упражнения для ног: $isLegs

        Упражнения для спины: $isBack

        Упражнения для пресса: $isPress"""
        )
    } else {
        isLegs = !isLegs
        isBack = !isBack
        println(
            """
        Упражнения для рук:$isHands

        Упражнения для ног: $isLegs

        Упражнения для спины: $isBack

        Упражнения для пресса: $isPress"""
        )
    }

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



}