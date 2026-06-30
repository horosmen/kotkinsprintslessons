fun main() {
    val ingridients = listOf("Яйца", "Масло", "Лук", "Пиво")

    println("В рецепте есть следующие ингредиенты: [${ingridients.joinToString(", ")}]")

    var i = 1
    ingridients.forEach { it ->
        println("$i. $it")
        i++
    }
}