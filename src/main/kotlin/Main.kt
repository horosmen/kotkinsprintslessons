sealed class Box {
    /** Площадь поверхности коробки */
    abstract fun surfaceArea(): Double

    /** Прямоугольная коробка с тремя измерениями */
    data class Rectangular(
        val length: Double,
        val width: Double,
        val height: Double
    ) : Box() {
        init {
            require(length > 0 && width > 0 && height > 0) {
                "Размеры должны быть положительными"
            }
        }

        override fun surfaceArea(): Double =
            2 * (length * width + width * height + height * length)
    }

    /** Коробка-куб, задаётся только ребром */
    data class Cube(val side: Double) : Box() {
        init {
            require(side > 0) { "Ребро должно быть положительным" }
        }

        override fun surfaceArea(): Double = 6 * side * side
    }
}

fun main() {
    val box1: Box = Box.Rectangular(2.0, 3.0, 4.0)
    val box2: Box = Box.Cube(5.0)

    println("Площадь прямоугольной: ${box1.surfaceArea()}") // 52.0
    println("Площадь куба: ${box2.surfaceArea()}")         // 150.0
}