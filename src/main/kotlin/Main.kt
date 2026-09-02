// Базовый интерфейс для представления информации о товарах в заказе
interface OrderItemsRepresentation {
    fun getItemsText(): String
}

// Реализация для одного товара (строка)
class SingleItem(private val itemName: String) : OrderItemsRepresentation {
    override fun getItemsText() = "Заказан товар: $itemName"
}

// Реализация для нескольких товаров (список строк)
class MultipleItems(private val items: List<String>) : OrderItemsRepresentation {
    override fun getItemsText(): String {
        val itemsText = items.joinToString(", ")
        return "Заказаны следующие товары: $itemsText"
    }
}

data class Order(
    val orderNumber: String,
    private val itemsRepresentation: OrderItemsRepresentation
) {
    fun printOrderInfo() {
        println("Заказ №$orderNumber")
        println(itemsRepresentation.getItemsText())
        println() // пустая строка для читаемости вывода
    }
}

fun main() {
    // Объект 1: заказ с одним товаром
    val singleOrder = Order(
        orderNumber = "ORD-1001",
        itemsRepresentation = SingleItem("Наушники беспроводные")
    )

    // Объект 2: заказ с несколькими товарами
    val multiOrder = Order(
        orderNumber = "ORD-1002",
        itemsRepresentation = MultipleItems(listOf("Клавиатура механическая", "Мышь игровая", "Коврик для мыши"))
    )

    // Вызов метода вывода информации
    singleOrder.printOrderInfo()
    multiOrder.printOrderInfo()
}
