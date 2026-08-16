interface Searchable {
    fun simulateSearch() {
        println("Выполняется поиск")
    }

    fun buildSearchResult(query: String): String

    fun findMatchingParts(query: String): String {
        simulateSearch()
        return buildSearchResult(query)
    }
}

abstract class Product(
    val name: String,
    var stockCount: Int
) {
    override fun toString(): String = "$name (на складе: $stockCount шт.)"
}

class Instrument(
    name: String,
    stockCount: Int
) : Product(name, stockCount), Searchable {
    override fun buildSearchResult(query: String): String {
        return "Для инструмента «$name» найдены комплектующие по запросу «$query»: струны, колки, ремни (пример)."
    }
}

class Accessory(
    name: String,
    stockCount: Int
) : Product(name, stockCount)

fun main() {
    val guitar = Instrument("Акустическая гитара", 5)
    guitar.simulateSearch()
    println(guitar.buildSearchResult("струны"))
    println(guitar.findMatchingParts("струны"))

    val drumSticks = Accessory("Палочки для барабанов", 20)
    val strings = Accessory("Струны для акустической гитары", 12)

    val allProducts: List<Product> = listOf(guitar, drumSticks, strings)
    allProducts.forEach { println(it) }
}
