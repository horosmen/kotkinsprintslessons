import kotlin.random.Random

/**
 * Генерирует пароль заданной длины из чередующихся цифр и спецсимволов.
 *
 * @param length длина пароля (должна быть > 0)
 * @param startWithDigit если true (по умолчанию), пароль начинается с цифры,
 *                       если false — со специального символа.
 * @return сгенерированный пароль
 * @throws IllegalArgumentException если длина <= 0
 */
fun generatePassword(length: Int, startWithDigit: Boolean = true): String {
    require(length > 0) { "Длина пароля должна быть положительной" }

    val digits = "0123456789"
    val specials = "!\"#$%&'()*+,-./ "  // 16 символов, включая пробел

    return buildString {
        repeat(length) { index ->
            // Определяем, какой тип символа должен быть на позиции index
            val isDigitPosition = if (startWithDigit) {
                index % 2 == 0   // чётные позиции — цифры
            } else {
                index % 2 == 1   // нечётные позиции — цифры
            }

            val char = if (isDigitPosition) {
                digits[Random.nextInt(digits.length)]
            } else {
                specials[Random.nextInt(specials.length)]
            }
            append(char)
        }
    }
}

fun main() {
    println("Введите длину пароля:")

    val input = readlnOrNull()
    val length = input?.toIntOrNull()

    if (length == null || length <= 0) {
        println("Ошибка: необходимо ввести положительное целое число.")
        return
    }

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



    val password2 = generatePassword(length, startWithDigit = false)
    println("Пароль (начинается со спецсимвола): $password2")
}