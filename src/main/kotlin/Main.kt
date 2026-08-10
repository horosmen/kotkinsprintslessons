import kotlin.math.PI

// Абстрактный класс — нельзя создать экземпляр Figure напрямую.
// Он задаёт общий контракт для всех фигур: цвет и обязательные вычисления.
abstract class Figure(val color: String) {

    // Абстрактные методы — каждый наследник обязан предоставить свою реализацию.
    abstract fun area(): Double
    abstract fun perimeter(): Double

    // Обычный (open) метод — может быть переопределён, но имеет реализацию по умолчанию.
    // Слово open разрешает переопределение в дочерних классах.
    open fun description(): String = "Фигура цвета $color"
}

// Класс круга наследует Figure.
// В первичном конструкторе передаём цвет в родительский класс.
class Circle(color: String, val radius: Double) : Figure(color) {

    // Реализация площади круга: π * r^2
    override fun area(): Double = PI * radius * radius

    // Реализация длины окружности: 2 * π * r
    override fun perimeter(): Double = 2 * PI * radius

    // Переопределяем описание, используя super для вызова родительской версии.
    // super.description() возвращает "Фигура цвета $color", к которой мы добавляем детали.
    override fun description(): String = "${super.description()}, радиус = $radius"
}

// Класс прямоугольника наследует Figure.
class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {

    // Площадь прямоугольника
    override fun area(): Double = width * height

    // Периметр прямоугольника
    override fun perimeter(): Double = 2 * (width + height)

    // Расширяем описание через super
    override fun description(): String =
        "${super.description()}, ширина = $width, высота = $height"
}

fun main() {
    // Создаём список фигур разных цветов.
    val figures = listOf(
        Circle("черный", 5.0),
        Rectangle("черный", 4.0, 6.0),
        Circle("белый", 3.0),
        Rectangle("белый", 2.0, 3.0),
        Circle("черный", 2.0),       // ещё один чёрный круг
        Rectangle("белый", 5.0, 1.0) // ещё один белый прямоугольник
    )

    // Выводим описания всех фигур (демонстрация super)
    println("Все фигуры:")
    figures.forEach { println(it.description()) }

    // Сумма периметров всех чёрных фигур.
    val totalBlackPerimeter = figures
        .filter { it.color == "черный" }
        .sumOf { it.perimeter() }

    // Сумма площадей всех белых фигур.
    val totalWhiteArea = figures
        .filter { it.color == "белый" }
        .sumOf { it.area() }

    println("\nСумма периметров всех чёрных фигур: %.2f".format(totalBlackPerimeter))
    println("Сумма площадей всех белых фигур: %.2f".format(totalWhiteArea))
}