class Weather(val dayTemperature: Double, val nightTemperature: Double, val precipitation: Boolean) {

    fun weatherReport() {
        if (precipitation == false) {
            println(
                "Day temperature: $dayTemperature, Night temperature: $nightTemperature, \n" +
                        "You don't need an umbrella. "
            )
        } else {
            println(
                "Day temperature: $dayTemperature, Night temperature: $nightTemperature, \n" +
                        "You need an umbrella. "
            )
        }
    }

}

fun main() {
    val weatherDay1 = Weather(31.2, 15.2, true)
    val weatherDay2 = Weather(41.1, 19.2, false)
    weatherDay1.weatherReport()
    weatherDay2.weatherReport()


}
