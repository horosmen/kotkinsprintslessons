class Weather(var dayTemperature: Double, var nightTemperature: Double, var precipitation: Boolean) {

    init {
        if (precipitation == false) {
            println("You don't need an umbrella.")
        } else {
            println("You need an umbrella.")
        }

    }

    fun weatherReport() {
        println("Day temperature: $dayTemperature, Night temperature: $nightTemperature, precipitation: $precipitation")
    }
}


fun main() {
    val weatherDay1 = Weather(31.2, 15.2, true)
    val weatherDay2 = Weather(41.1, 19.2, false)
    weatherDay1.weatherReport()
    weatherDay2.weatherReport()


}