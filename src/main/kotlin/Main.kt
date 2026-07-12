fun main() {
    val ingridients = listOf("Яйца", "Масло", "Лук", "Пиво")

    println("В рецепте есть следующие ингредиенты: [${ingridients.joinToString(", ")}]")

    ingridients.forEach { it ->
        println("$it")
    }
}