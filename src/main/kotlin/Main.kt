class Order(val orderNumber: String) {

    fun printOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrder(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order("ORD-1001")
    order1.printOrder("Наушники беспроводные")

    val order2 = Order("ORD-1002")
    order2.printOrder(listOf("Клавиатура механическая", "Мышь игровая", "Коврик для мыши"))
}
