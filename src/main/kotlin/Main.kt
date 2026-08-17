// Интерфейсы
interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun transportName(): String = "Транспорт"

    fun loadPassenger(count: Int): Boolean {
        if (count <= 0) {
            println("${transportName()}: количество пассажиров должно быть положительным")
            return false
        }
        return if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("${transportName()}: загружено $count пассажиров (теперь ${currentPassengers} чел.)")
            true
        } else {
            println("${transportName()}: невозможно загрузить $count пассажиров, максимум $maxPassengers")
            false
        }
    }

    fun unloadPassenger(count: Int): Boolean {
        if (count <= 0) {
            println("${transportName()}: количество пассажиров должно быть положительным")
            return false
        }
        return if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("${transportName()}: выгружено $count пассажиров (осталось ${currentPassengers} чел.)")
            true
        } else {
            println("${transportName()}: нельзя выгрузить $count пассажиров, сейчас их ${currentPassengers}")
            false
        }
    }
}

interface CargoTransport {
    val maxCargo: Double
    var currentCargo: Double

    fun transportName(): String = "Транспорт"

    fun loadCargo(amount: Double): Boolean {
        if (amount <= 0.0) {
            println("${transportName()}: количество груза должно быть положительным")
            return false
        }
        return if (currentCargo + amount <= maxCargo) {
            currentCargo += amount
            println("${transportName()}: загружено $amount тонн груза (теперь ${currentCargo} т)")
            true
        } else {
            println("${transportName()}: невозможно загрузить $amount т, максимум $maxCargo т")
            false
        }
    }

    fun unloadCargo(amount: Double): Boolean {
        if (amount <= 0.0) {
            println("${transportName()}: количество груза должно быть положительным")
            return false
        }
        return if (currentCargo - amount >= 0) {
            currentCargo -= amount
            println("${transportName()}: выгружено $amount тонн груза (осталось ${currentCargo} т)")
            true
        } else {
            println("${transportName()}: нельзя выгрузить $amount т, сейчас ${currentCargo} т")
            false
        }
    }
}

// Базовый класс
abstract class Vehicle : Movable {
    override fun move() {
        println("${this::class.simpleName} едет.")
    }
}

// Грузовик
class Truck(
    override val maxPassengers: Int = 1,
    override val maxCargo: Double = 2.0
) : Vehicle(), PassengerTransport, CargoTransport {

    override var currentPassengers: Int = 0
    override var currentCargo: Double = 0.0

    override fun transportName(): String = "Грузовик"
}

// Легковая
class Car(
    override val maxPassengers: Int = 3
) : Vehicle(), PassengerTransport {

    override var currentPassengers: Int = 0

    override fun transportName(): String = "Легковая"
}

// Демонстрация
fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    var loadedPassengers = 0
    var loadedCargo = 0.0

    println("=== Погрузка ===")
    if (truck.loadPassenger(1)) loadedPassengers += 1
    if (truck.loadCargo(2.0)) loadedCargo += 2.0

    if (car1.loadPassenger(3)) loadedPassengers += 3
    if (car2.loadPassenger(2)) loadedPassengers += 2

    println("\nУспешно загружено: $loadedPassengers человек и $loadedCargo тонн груза.")
    require(loadedPassengers == 6) { "Ожидалось 6 пассажиров, загружено $loadedPassengers" }
    require(loadedCargo == 2.0) { "Ожидалось 2 тонны груза, загружено $loadedCargo" }

    println("\n=== Движение ===")
    truck.move()
    car1.move()
    car2.move()

    println("\n=== Разгрузка ===")
    var unloadedPassengers = 0
    var unloadedCargo = 0.0
    if (truck.unloadPassenger(1)) unloadedPassengers += 1
    if (truck.unloadCargo(2.0)) unloadedCargo += 2.0
    if (car1.unloadPassenger(3)) unloadedPassengers += 3
    if (car2.unloadPassenger(2)) unloadedPassengers += 2

    println("\nВыгружено: $unloadedPassengers человек и $unloadedCargo тонн груза.")
    require(unloadedPassengers == 6) { "Выгружено не все пассажиры" }
    require(unloadedCargo == 2.0) { "Выгружен не весь груз" }

    // Итоговая проверка остатков
    println("\nОстаток в транспорте:")
    println("Грузовик: пассажиров ${truck.currentPassengers}, груза ${truck.currentCargo} т")
    println("Легковая1: пассажиров ${car1.currentPassengers}")
    println("Легковая2: пассажиров ${car2.currentPassengers}")
    require(truck.currentPassengers == 0 && truck.currentCargo == 0.0 &&
            car1.currentPassengers == 0 && car2.currentPassengers == 0) {
        "После разгрузки в транспорте остались люди или груз"
    }

    println("\n✅ Все перевезено успешно: 6 человек и 2 тонны груза.")
}