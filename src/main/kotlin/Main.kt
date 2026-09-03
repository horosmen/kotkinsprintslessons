abstract class Dice(val sides: Int) {
    abstract fun roll(): Int

    fun printRoll() {
        val value = roll()
        println("Брошена кость с $sides гранями: выпало $value")
    }
}

class Dice4 : Dice(4) {
    override fun roll(): Int = (1..sides).random()
}

class Dice6 : Dice(6) {
    override fun roll(): Int = (1..sides).random()
}

class Dice8 : Dice(8) {
    override fun roll(): Int = (1..sides).random()
}

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    // Список объектов с общим типом Dice — здесь проявляется полиморфизм
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    for (dice in diceList) {
        dice.printRoll()
    }
}
