package org.example

const val FAVORABLE_WEATHER_SUNNY = true
const val FAVORABLE_TENT_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val WINTER_SEASON = "winter"

fun main() {
    val isWeatherToday: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "winter"
    val favorableConditions = isWeatherToday == FAVORABLE_WEATHER_SUNNY &&
            isTentOpen == FAVORABLE_TENT_OPEN &&
            airHumidity == FAVORABLE_AIR_HUMIDITY &&
            season != WINTER_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}
