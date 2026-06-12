package org.example

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main() {
    val hasDamage: Boolean = readln().toBoolean()
    val isСrew: Int = readln().toInt()
    val isFoodBoxes: Int = readln().toInt()
    val isFavorableWeather = readln().toBoolean()

    val canDepart = (!hasDamage && isСrew in CREW_MIN..CREW_MAX && isFoodBoxes > PROVISION_MIN) ||
            (hasDamage && isСrew == 70 && isFavorableWeather && isFoodBoxes >= PROVISION_MIN)

    println(if (canDepart) "Корабль может отправиться в плавание" else "Корабль не может отправиться в плавание")

}