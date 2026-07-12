fun main() {

    val resultHuman = rollDice()
    val resultComputer = rollDice()
    println("Human rolled a ${resultHuman}.")

    println("Computer rolled a ${resultComputer}.")

    if (resultHuman > resultComputer) {
        println("Humanity won.")
    } else if (resultHuman < resultComputer) {
        println("The machine won.")
    } else {
        println("Friendship won.")
    }

}

fun rollDice(): Int = (1..6).random()



