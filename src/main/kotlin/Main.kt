package org.example

fun main() {
    val weatherToDay: Boolean = true
    val tentOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "winter"
    val favorableConditions = weatherToDay && tentOpen && airHumidity == 20 && season != "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}
