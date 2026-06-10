package org.example

const val MIN_WEIGHT = 35.0 // кг, не включительно
const val MAX_WEIGHT = 100.0 // кг, включительно
const val MAX_VOLUME = 100.0 // л, не включительно

fun main() {
    val (cargoWeightOne, cargoVolumeOne) = Pair(20, 80)
    val (cargoWeightTwo, cargoVolumeTwo) = Pair(50, 100)
    println(
        "Груз с весом $cargoWeightOne кг и объемом $cargoVolumeOne л соответствует категории 'Average': "
                + (cargoWeightOne > MIN_WEIGHT && cargoWeightOne <= MAX_WEIGHT && cargoVolumeOne < MAX_VOLUME)
    )
    println(
        "Груз с весом $cargoWeightTwo кг и объемом $cargoVolumeTwo л соответствует категории 'Average': "
                + (cargoWeightTwo > MIN_WEIGHT && cargoWeightTwo <= MAX_WEIGHT && cargoVolumeTwo < MAX_VOLUME)
    )

}