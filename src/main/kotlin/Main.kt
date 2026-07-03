fun main() {
    println("Hi friend, enter 5 ingredients separated by commas.")
    val ingredients = readln().split(", ")
    if (ingredients.size != 5) {
        println("Oh, damn, sorry, but I need 5 ingredients. (introduced: ${ingredients.size})")
        return
    }
    println(ingredients.sorted())
}