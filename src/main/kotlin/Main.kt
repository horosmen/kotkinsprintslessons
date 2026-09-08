enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Вы можете добавить в свой аквариум следующие виды рыб:")
    Fish.values().forEach { fish ->
        // Преобразуем имя константы в читаемый вид: заменяем подчёркивания на пробелы, делаем первую букву заглавной, остальные — строчными
        val displayName = fish.name
            .replace("_", " ")
            .lowercase()
            .replaceFirstChar { it.uppercase() }
        println("- $displayName")
    }
}
