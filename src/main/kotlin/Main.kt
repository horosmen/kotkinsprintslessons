fun main() {
    val ingredients = mutableListOf("Яйца", "Масло", "Пиво")

    println("В рецепте есть базовые ингредиенты: [${ingredients.joinToString(", ")}]")
    println("Желаете добавить ещё?")

    var ingredient = readlnOrNull()
    if (ingredient == null || ingredient.equals("нет", ignoreCase = true)) {
        return
    } else if (ingredient.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        var ingredient = readln()
        ingredients.add(ingredient)
        println("Теперь в рецепте есть следующие ингредиенты:[${ingredients.joinToString(", ")}]")
    }

}