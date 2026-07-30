import kotlin.random.Random

class Weather(dayKelvin: Int, nightKelvin: Int, precipitation: Boolean) {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    init {
        dayTemperature = dayKelvin - 273
        nightTemperature = nightKelvin - 273
        this.precipitation = precipitation

        require(dayTemperature >= -273 && nightTemperature >= -273) { "Temperature below absolute zero" }

//        println("Day temperature: $dayTemperature ℃, Night temperature: $nightTemperature ℃, precipitation: $precipitation")
    }

}

fun main() {
    val weatherList = mutableListOf<Weather>()

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



    repeat(30) {
        val day = Random.nextInt(223, 324)   // от 223 до 323 включительно
        val night = Random.nextInt(223, 324)
        val precipitation = Random.nextBoolean()
        weatherList.add(Weather(day, night, precipitation))
    }
    val dayTemps = weatherList.map { it.dayTemperature }
    val nightTemps = weatherList.map { it.nightTemperature }
    val daysWithPrecipitation = weatherList.count { it.precipitation }
    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()
    println("=== Отчёт по погоде за 30 дней ===")
    println("Дневные температуры: $dayTemps")
    println("Ночные температуры: $nightTemps")
    println("Дней с осадками: $daysWithPrecipitation")
    println("Средняя дневная температура: ${"%.1f".format(avgDay)}")
    println("Средняя ночная температура: ${"%.1f".format(avgNight)}")

}