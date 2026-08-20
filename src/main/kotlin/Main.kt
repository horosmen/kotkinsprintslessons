import kotlin.random.Random

class Dice {
    private val value: Int = Random.nextInt(1, 7) // случайное число от 1 до 6

    fun showValue() {
        println("Выпало число: $value")
    }
}

fun main() {
    val dice = Dice()
    dice.showValue()
}
