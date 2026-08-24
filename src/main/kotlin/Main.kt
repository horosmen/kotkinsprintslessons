private const val PI = 3.14

class Circle(initialRadius: Double) {
    // Радиус передан через конструктор и не виден извне класса вообще
    private var radius: Double = initialRadius

    // Длина окружности: C = 2 * π * r
    fun getCircumference(): Double = 2 * PI * radius

    // Площадь круга: S = π * r^2
    fun getArea(): Double = PI * radius * radius
}

fun main() {
    val circle = Circle(5.0)

    println("Радиус: 5.0")
    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getArea()}")
}
