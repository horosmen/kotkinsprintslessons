fun main() {
    println("Hi friend, enter 5 ingredients.")

    val ingredients = mutableListOf<String>()
    repeat(5) {
        val input = readln()
        ingredients.add(input)
    }
    val uniqueIngredients = ingredients.distinct().toMutableList()

    uniqueIngredients.sort()

    uniqueIngredients[0] = uniqueIngredients[0].replaceFirstChar { it.uppercase() }

    println(uniqueIngredients.joinToString(", "))
}
