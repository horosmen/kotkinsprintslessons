abstract class WeatherStationStats {
    abstract fun getDataDescription(): String
}

class Temperature(val value: Double, val unit: String = "°C") : WeatherStationStats() {
    override fun getDataDescription(): String {
        return "Температура: $value $unit"
    }
}

class PrecipitationAmount(val amount: Double, val unit: String = "мм") : WeatherStationStats() {
    override fun getDataDescription(): String {
        return "Осадки: $amount $unit"
    }
}

class WeatherServer {
    fun sendData(stats: WeatherStationStats) {
        // Имитация отправки на сервер — просто выводим в консоль
        println("[Сервер] Получены данные: ${stats.getDataDescription()}")
    }
}

fun main() {
    val server = WeatherServer()

    // Создаём объекты разных типов погодных данных
    val tempData = Temperature(23.5)
    val precipData = PrecipitationAmount(4.2)

    // Тестируем работу системы
    server.sendData(tempData)
    server.sendData(precipData)
}
