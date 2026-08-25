class User(
    private val login: String,
    private val password: String
) {
    /**
     * Проверяет, совпадает ли переданный пароль с сохранённым.
     * Возвращает только Boolean, без логов и лишних строк.
     */
    fun validatePassword(input: String): Boolean = input == password
}

fun main() {
    // Пароль не виден в main — он инкапсулирован внутри User
    val user = User("alice", "secret123")

    // Пример проверки: в main мы не видим пароль, только результат
    val enteredPassword = "secret123"
    val isCorrect = user.validatePassword(enteredPassword)

    println(if (isCorrect) "Пароль введён верно" else "Неверный пароль")
}
