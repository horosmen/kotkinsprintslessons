fun main() {
    println("Добро пожаловать в игру «Бросок костей»!")

    var humanWins = 0
    var answer: String

    do {
        if (playRound()) {
            humanWins++
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln().trim().lowercase()

    } while (answer == "да")

    println("Человек выиграл $humanWins партий.")
}

fun rollDice(sides: Int = 6): Int = (1..sides).random()

fun playRound(): Boolean {

    println("Бросок человека")
    val resultHuman = rollDice(sides = 6)
    println("Человек бросил: $resultHuman")

    println("Бросок компьютера")
    val resultComputer = rollDice(sides = 6)
    println("Компьютер бросил: $resultComputer")

    if (resultHuman > resultComputer) {
        println("Победило человечество")
        return true
    } else if (resultHuman < resultComputer) {
        println("Победила машина")
        return false
    } else {
        println("Победила дружба")
        return false
    }
}