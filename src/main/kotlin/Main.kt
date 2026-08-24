class Circle(initialRadius: Double) {
    companion object {
        private const val PI = 3.14
    }

    init {
        require(initialRadius > 0) { "Радиус должен быть положительным числом" }
    }

    var radius: Double = initialRadius
        private set

    fun setRadius(value: Double) {
        require(value > 0) { "Радиус должен быть положительным числом" }
        radius = value
    }

    val circumference: Double get() = 2 * PI * radius
    val area: Double get() = PI * radius * radius
}
