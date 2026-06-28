package org.example

fun main() {
    println("Введите количество ингредиентов:")
    val count = readln().toInt()
    val ingredients = Array(count){""}
    for (i in 0..< count){
        println("Введите ингредиент: ${i+1}")
        ingredients[i] = readln()
    }
    println(ingredients.joinToString(","))
}