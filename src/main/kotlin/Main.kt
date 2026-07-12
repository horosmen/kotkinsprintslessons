fun main() {
    println("Бросок человека")

    val resultHuman = rollDice()

    println("Бросок компьютера")

    val resultComputer = rollDice()
    println("Человек бросил:  ${resultHuman}.")

    println("Компьютер бросил:  ${resultComputer}.")

    if (resultHuman > resultComputer) {
        println("Победило человечество")
    } else if (resultHuman < resultComputer) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }

}

fun rollDice(): Int = (1..6).random()



