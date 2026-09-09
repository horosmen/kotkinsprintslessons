enum class ProductCategory {
    CLOTHES,
    STATIONERY,
    MISCELLANEOUS;

    fun getDisplayName(): String = when (this) {
        CLOTHES -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISCELLANEOUS -> "Разное"
    }
}

data class Product(
    val name: String,
    val id: Int,
    val category: ProductCategory
) {
    fun printInfo() {
        println("Товар: ${name}")
        println("ID: $id")
        println("Категория: ${category.getDisplayName()}")
        println("-------------------------")
    }
}

fun main() {
    val tShirt = Product("Футболка базовая", 101, ProductCategory.CLOTHES)
    val notebook = Product("Тетрадь в клетку", 205, ProductCategory.STATIONERY)
    val mug = Product("Кружка керамическая", 312, ProductCategory.MISCELLANEOUS)

    tShirt.printInfo()
    notebook.printInfo()
    mug.printInfo()
}
