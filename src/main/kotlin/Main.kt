class User(
    login: String,
    password: String
) {

    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {

    val user = User(
        login = "miron",
        password = "12345678"
    )

    // Читаем данные пользователя
    println("Логин: ${user.login}")
    println("Пароль: ${user.password}")

    // Пытаемся изменить логин
    user.login = "miron123"

    // Проверяем новый логин
    println("Новый логин: ${user.login}")

    // Пытаемся изменить пароль
    user.password = "qwerty"

    // Проверяем пароль
    println("Пароль: ${user.password}")
}