// Базовый класс — лайнер.
// capacity объявлен как open, чтобы наследники могли его переопределить.
open class Liner(
    val name: String,
    open val speed: Int = 25,
    open val capacity: Int = 3000
) {
    protected fun baseInfo(): String =
        "Корабль: $name | Скорость: $speed узлов"

    open fun info(): String =
        baseInfo() + " | Пассажиров: $capacity"
}

// Грузовой корабль: переопределяет speed и capacity.
// cargoCapacity — алиас-геттер, не хранит отдельное значение.
class CargoShip(
    name: String,
    override val speed: Int = 16,
    override val capacity: Int = 5000
) : Liner(name, speed, capacity) {

    val cargoCapacity: Int get() = capacity

    override fun info(): String =
        baseInfo() + " | Грузоподъёмность: $cargoCapacity т"
}

// Ледокол: переопределяет speed и capacity, добавляет iceBreakingPower.
class Icebreaker(
    name: String,
    override val speed: Int = 14,
    override val capacity: Int = 800,
    val iceBreakingPower: Int = 15
) : Liner(name, speed, capacity) {

    fun breakIce(): Boolean = iceBreakingPower >= 10

    override fun info(): String =
        baseInfo() + " | Мощность колки льда: $iceBreakingPower | Вместимость: $capacity ед."
}

fun main() {
    val liner = Liner("Атлантик")
    val cargo = CargoShip("Грузовой-1")
    val icebreaker = Icebreaker("Арктика")

    println(liner.info())
    println(cargo.info())
    println(icebreaker.info())

    println("\nПопытка расколоть лёд...")
    if (icebreaker.breakIce()) {
        println("Ледокол «${icebreaker.name}» успешно расколол лёд!")
    } else {
        println("Ледоколу «${icebreaker.name}» не хватило мощности.")
    }
}
