fun main() {
    val ingredients = mutableListOf<String>()
    println("Hi friend, enter 5 ingredients.")
    while (ingredients.size < 5) {
        val input = readln()
        if (!ingredients.contains(input)) ingredients.add(input)

    }
    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercase() }
    println(ingredients.joinToString(", "))
}