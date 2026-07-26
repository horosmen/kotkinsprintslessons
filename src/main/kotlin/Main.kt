class WeatherDay {
    var dayTimeTemperature: Double = 0.0
    var nightTimeTemperature: Double = 0.0
    var precipitation: Boolean = false
    var dayOf: String = ""

    fun reportOfWeather(){
        println("$dayOf Day temperature: $dayTimeTemperature and precipitation: $precipitation")
        println("$dayOf Night temperature: $nightTimeTemperature and precipitation: $precipitation")
    }
}

fun main() {
    val weatherDay1 = WeatherDay()
    weatherDay1.dayOf = "Monday"
    weatherDay1.dayTimeTemperature = 31.2
    weatherDay1.nightTimeTemperature = 20.5
    weatherDay1.precipitation = true
    weatherDay1.reportOfWeather()

    val weatherDay2 = WeatherDay()
    weatherDay2.dayOf = "Tuesday"
    weatherDay2.dayTimeTemperature = 25.2
    weatherDay2.nightTimeTemperature = 10.2
    weatherDay2.reportOfWeather()
}