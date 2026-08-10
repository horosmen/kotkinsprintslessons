import kotlin.math.PI

// Константы для цветов, чтобы избежать повторения строк и возможных опечаток
const val COLOR_BLACK = "черный"
const val COLOR_WHITE = "белый"

// Абстрактный класс Figure — основа для всех геометрических фигур
abstract class Figure(val color: String) {

    // Абстрактные методы: каждый наследник обязан предоставить свою реализацию
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

// Класс круга
class Circle(color: String, val radius: Double) : Figure(color) {

    // Площадь круга: π * r^2
    override fun area(): Double = PI * radius * radius

    // Длина окружности (периметр): 2 * π * r
    override fun perimeter(): Double = 2 * PI * radius
}

// Класс прямоугольника
class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {

    // Площадь прямоугольника: ширина * высота
    override fun area(): Double = width * height

    // Периметр прямоугольника: 2 * (ширина + высота)
    override fun perimeter(): Double = 2 * (width + height)
}

fun main() {
    // Создаём список фигур, используя константы для цвета
    val figures = listOf(
        Circle(COLOR_BLACK, 5.0),
        Rectangle(COLOR_BLACK, 4.0, 6.0),
        Circle(COLOR_WHITE, 3.0),
        Rectangle(COLOR_WHITE, 2.0, 3.0),
        Circle(COLOR_BLACK, 2.0),       // дополнительный чёрный круг
        Rectangle(COLOR_WHITE, 5.0, 1.0) // дополнительный белый прямоугольник
    )

    // Сумма периметров всех чёрных фигур
    val totalBlackPerimeter = figures
        .filter { it.color == COLOR_BLACK }
        .sumOf { it.perimeter() }

    // Сумма площадей всех белых фигур
    val totalWhiteArea = figures
        .filter { it.color == COLOR_WHITE }
        .sumOf { it.area() }

    // Выводим только требуемые результаты
    println("Сумма периметров всех чёрных фигур: %.2f".format(totalBlackPerimeter))
    println("Сумма площадей всех белых фигур: %.2f".format(totalWhiteArea))
}