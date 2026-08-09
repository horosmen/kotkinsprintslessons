/**
 * Базовый класс — лайнер (версия 2).
 * Содержит общие свойства и методы, переопределяемые в наследниках.
 */
open class LinerV2(
    val name: String,
    open val speed: Int = 25,
    open val capacity: Int = 3000
) {
    protected fun baseInfo(): String =
        "Корабль: $name | Скорость: $speed узлов"

    open fun info(): String =
        baseInfo() + " | Пассажиров: $capacity"

    open fun load() {
        println("Лайнер «$name» выдвигает горизонтальный трап со шкафута.")
    }
}

/**
 * Грузовой корабль (версия 2).
 * Переопределяет скорость и вместимость, добавляет грузоподъёмность (алиас).
 */
class CargoShipV2(
    name: String,
    override val speed: Int = 16,
    override val capacity: Int = 5000
) : LinerV2(name, speed, capacity) {

    val cargoCapacity: Int get() = capacity

    override fun info(): String =
        baseInfo() + " | Грузоподъёмность: $cargoCapacity т"

    override fun load() {
        println("Грузовой корабль «$name» активирует погрузочный кран.")
    }
}

/**
 * Ледокол (версия 2).
 * Переопределяет скорость и вместимость, добавляет мощность колки льда.
 */
class IcebreakerV2(
    name: String,
    override val speed: Int = 14,
    override val capacity: Int = 800,
    val iceBreakingPower: Int = 15
) : LinerV2(name, speed, capacity) {

    companion object {
        private const val MIN_ICE_BREAKING_POWER = 10
    }

    fun breakIce(): Boolean = iceBreakingPower >= MIN_ICE_BREAKING_POWER

    override fun info(): String =
        baseInfo() + " | Мощность колки льда: $iceBreakingPower | Вместимость: $capacity ед."

    override fun load() {
        println("Ледокол «$name» открывает ворота со стороны кормы.")
    }
}

/**
 * Главная функция: демонстрация полиморфизма и специфичных методов.
 */
fun main() {
    // Полиморфный список кораблей
    val ships: List<LinerV2> = listOf(
        LinerV2("Атлантик"),
        CargoShipV2("Грузовой-1"),
        IcebreakerV2("Арктика")
    )

    println("=== Информация о кораблях и погрузка ===\n")
    ships.forEach { ship ->
        println(ship.info())
        ship.load()
        println()
    }

    // Поиск ледокола идиоматичным способом (без двойной проверки типа)
    val icebreaker = ships.filterIsInstance<IcebreakerV2>().firstOrNull()

    when (icebreaker) {
        null -> println("Ледокол в списке не найден.")
        else -> {
            println("=== Проверка ледокола ===")
            println("Попытка расколоть лёд...")
            if (icebreaker.breakIce()) {
                println("Ледокол «${icebreaker.name}» успешно расколол лёд!")
            } else {
                println("Ледоколу «${icebreaker.name}» не хватило мощности.")
            }
        }
    }
}