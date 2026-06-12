package org.example

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main() {
    val isDamage: Boolean = readln().toBoolean()
    val crew: Int = readln().toInt()
    val foodBoxes: Int = readln().toInt()
    val isFavorableWeather = readln().toBoolean()

    val isCanDepart = (!isDamage && crew in CREW_MIN..CREW_MAX && foodBoxes > PROVISION_MIN) ||
            (isDamage && crew == 70 && isFavorableWeather && foodBoxes >= PROVISION_MIN)

    println(if (isCanDepart) "Корабль может отправиться в плавание" else "Корабль не может отправиться в плавание")

}