class Screen {
    // Точка: перегружаем по типу координат
    fun drawPoint(x: Int, y: Int): String = "Нарисована точка в координатах ($x, $y)"
    fun drawPoint(x: Float, y: Float): String = "Нарисована точка в координатах ($x, $y)"

    // Квадрат: перегружаем по типу координат
    fun drawSquare(x: Int, y: Int): String = "Нарисован квадрат в координатах ($x, $y)"
    fun drawSquare(x: Float, y: Float): String = "Нарисован квадрат в координатах ($x, $y)"

    // Круг: перегружаем по типу координат и радиуса
    fun drawCircle(x: Int, y: Int, radius: Int): String =
        "Нарисован круг в координатах ($x, $y) с радиусом $radius"

    fun drawCircle(x: Float, y: Float, radius: Float): String =
        "Нарисован круг в координатах ($x, $y) с радиусом $radius"
}
