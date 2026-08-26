class Order(val orderNumber: String, private var status: String = "Новый") {

    // Внутренний метод для изменения статуса (доступен только внутри класса)
    private fun updateStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа №$orderNumber изменён на: $status")
    }

    // Публичный метод: имитирует отправку заявки менеджеру
    fun requestStatusChange(newStatus: String) {
        println("Заявка на изменение статуса заказа №$orderNumber отправлена менеджеру.")
        println("Запрошен новый статус: $newStatus")

        // Имитация согласования менеджером — сразу одобряем для демонстрации
        updateStatus(newStatus)
    }

    fun getStatus(): String = status
}

fun main() {
    val order = Order("ORD-12345")

    println("Текущий статус: ${order.getStatus()}")

    // Пытаемся «изменить» статус напрямую — не получится, т.к. status приватный
    // order.status = "В обработке"  // ошибка компиляции

    // Отправляем заявку менеджеру для смены статуса
    order.requestStatusChange("В обработке")
    println("Актуальный статус: ${order.getStatus()}")

    order.requestStatusChange("Готов к выдаче")
    println("Актуальный статус: ${order.getStatus()}")
}
