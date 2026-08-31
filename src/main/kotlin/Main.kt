class Ship {

    var name: String = "Aurora"
        set(value) {
            println("Warning: Ship name cannot be changed!")
        }

    var averageSpeed: Double = 25.5

    var homePort: String = "Rotterdam"
}

fun main() {

    val ship = Ship()

    println("Ship name: ${ship.name}")
    println("Average speed: ${ship.averageSpeed}")
    println("Home port: ${ship.homePort}")

    // Пытаемся изменить имя
    ship.name = "Titanic"

    // Проверяем, изменилось ли имя
    println("Ship name: ${ship.name}")

    // Изменяем скорость
    ship.averageSpeed = 30.0

    // Изменяем порт
    ship.homePort = "Amsterdam"

    println("New average speed: ${ship.averageSpeed}")
    println("New home port: ${ship.homePort}")
}