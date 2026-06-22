import kotlin.random.Random

fun main() {
    while (true) {
        val authCode = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $authCode")

        print("Введите код для авторизации: ")
        val userInput = readln()
        val userCode = userInput.toIntOrNull() // Возвращает null при ошибке

        if (userCode != null && userInput.length == 4) {
            if (userCode == authCode) {
                println("Добро пожаловать! Авторизация успешна.")
                break
            } else {
                println("Неверный код. Попробуйте снова.")
            }
        } else {
            println("Некорректный ввод. Пожалуйста, введите 4‑значный числовой код.")
        }
    }
}