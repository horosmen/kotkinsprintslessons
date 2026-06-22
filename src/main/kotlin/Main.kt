fun main() {
    println("Введите число")
    val userInput = readln().toIntOrNull()
    val userNumber = userInput
    if (userInput != null) {
        for (i in 0..userNumber step 2) {
            print("$i ")
        }
    }
}