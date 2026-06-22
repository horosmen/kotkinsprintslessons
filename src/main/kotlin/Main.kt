fun main() {
    println("Введите число: ")
    val userInput = readln().toIntOrNull()
    if (userInput != null) {
        for (i in 0..userInput step 2) {
            print("$i ")
        }
    }
}