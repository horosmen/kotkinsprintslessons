fun main() {
    val ingredients = mutableListOf(2, 50, 15)
    println("Введите число")
    val numberOfServings = readln().toIntOrNull() ?: run {
        println("Вы ввели не число!")
        return
    }

    if (numberOfServings <= 0) {
        println("Введите число больше 0")
        return
    }

    for (i in ingredients.indices) {
        ingredients[i] = ingredients[i] * numberOfServings
    }

    println(
        "На $numberOfServings порций вам понадобится: " +
                "Яиц – ${ingredients[0]}, молока – ${ingredients[1]}, " +
                "сливочного масла – ${ingredients[2]}"
    )
}