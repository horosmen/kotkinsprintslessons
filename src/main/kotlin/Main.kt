class Screen {
    // Точка
    fun drawPoint(x: Int, y: Int): String = "Нарисована точка в координатах ($x, $y)"
    fun drawPoint(x: Float, y: Float): String = "Нарисована точка в координатах ($x, $y)"

    // Квадрат
    fun drawSquare(x: Int, y: Int): String = "Нарисован квадрат в координатах ($x, $y)"
    fun drawSquare(x: Float, y: Float): String = "Нарисован квадрат в координатах ($x, $y)"

    // Круг
    fun drawCircle(x: Int, y: Int): String = "Нарисован круг в координатах ($x, $y)"
    fun drawCircle(x: Float, y: Float): String = "Нарисован круг в координатах ($x, $y)"
}

fun main() {
    val screen = Screen()

    println(screen.drawPoint(10, 20))
    println(screen.drawPoint(10.5f, 20.3f))

    println(screen.drawSquare(5, 5))
    println(screen.drawSquare(5.5f, 5.5f))

    println(screen.drawCircle(0, 0))
    println(screen.drawCircle(0.0f, 0.0f))
}
