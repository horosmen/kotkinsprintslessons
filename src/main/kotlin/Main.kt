package org.example

fun main() {
    val damage: Boolean = readln().toBoolean()
    val crew: Int = readln().toInt()
    val foodBoxes: Int = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val canDepart = (!damage && crew in 55..70 && foodBoxes > 50 && (favorableWeather || !favorableWeather)) || (damage && crew == 70 && favorableWeather && foodBoxes >= 50)

    println(if (canDepart) "Корабль может отправиться в плавание" else "Корабль не может отправиться в плавание")

}