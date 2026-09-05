abstract class Box(
    open val width: Double,
    open val height: Double,
    open val depth: Double
) {
    // Площадь поверхности прямоугольного параллелепипеда: 2*(wh + wd + hd)
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    override val width: Double,
    override val height: Double,
    override val depth: Double
) : Box(width, height, depth) {

    init {
        require(width > 0 && height > 0 && depth > 0) { "Размеры должны быть положительными" }
    }

    override fun surfaceArea(): Double {
        return 2 * (width * height + width * depth + height * depth)
    }
}

class CubeBox(
    side: Double
) : Box(side, side, side) {

    init {
        require(side > 0) { "Длина ребра должна быть положительной" }
    }

    override fun surfaceArea(): Double {
        // У куба 6 граней, каждая площадью side^2
        return 6 * side * side
    }
}
