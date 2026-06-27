package org.example

fun main() {
    val recipesFriedEggs = arrayOf("Яйцо", "Соль", "Перец", "Лук", "Помидор", "Колбаса")
    println("Какой ингредиент вы хотите найти?: ")
    val request = readln()

    var found = false
    for (ingredient in recipesFriedEggs) {
        if (ingredient == request) {
            println("Ингредиент $request в рецепте есть")
            found = true
            break
        }
    }

    if (!found) {
        println("Такого ингредиента в рецепте нет")
    }
}
