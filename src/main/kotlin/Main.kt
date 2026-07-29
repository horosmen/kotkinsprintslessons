class Weather(dayKelvin: Int, nightKelvin: Int, precipitation: Boolean) {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    init {
        dayTemperature = dayKelvin - 273
        nightTemperature = nightKelvin - 273
        this.precipitation = precipitation

        require(dayTemperature >= -273 && nightTemperature >= -273) { "TTemperature below absolute zero" }

        println("Day temperature: $dayTemperature ℃, Night temperature: $nightTemperature ℃, precipitation: $precipitation")
    }

}

fun main() {
    val weatherDay1 = Weather(304, 300, true)

}