fun main() {
    val recipesFriedEggs = arrayOf("Яйцо", "Соль", "Перец", "Лук", "Помидор", "Колбаса")
    println("Какой ингредиент вы хотите найти?: ")
    val request = readln()

    if (request in recipesFriedEggs) {
        println("Ингредиент $request в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
