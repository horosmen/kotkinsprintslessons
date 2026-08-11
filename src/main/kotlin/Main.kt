
open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {

    // Изменять список можно только внутри класса Planet
    private val satellites = mutableListOf<Satellite>()

    // Снаружи список доступен только для чтения
    val allSatellites: List<Satellite>
        get() = satellites

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, suitableForLanding)


fun main() {

    val planet = Planet(
        name = "Jupiter",
        hasAtmosphere = true,
        suitableForLanding = false
    )

    val io = Satellite(
        name = "Io",
        hasAtmosphere = true,
        suitableForLanding = false
    )

    val europa = Satellite(
        name = "Europa",
        hasAtmosphere = true,
        suitableForLanding = false
    )

    planet.addSatellite(io)
    planet.addSatellite(europa)

    println("Planet: ${planet.name}")
    println("Satellites:")

    for (satellite in planet.allSatellites) {
        println("- ${satellite.name}")
    }
}

