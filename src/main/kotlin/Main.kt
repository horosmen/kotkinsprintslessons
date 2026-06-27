package org.example

fun main() {
    val ingredients = arrayOf("Мука", "Яйца", "Молоко")
    println(ingredients.joinToString(", "))
    println("Какой ингредиент вы хотите заменить?: ")
    val userIngredient = readln()
    if (userIngredient in ingredients) {
        println("Добавьте новый ингредиент: ")
        val newIngredient = readln()
        val i = ingredients.indexOf(userIngredient)
        ingredients[i] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
    } else {
        println("Такого ингредиента нет!")
    }
}

