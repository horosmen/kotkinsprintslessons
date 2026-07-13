fun main() {
    println("Введите ваш логин и пароль")
    val isValid = validateLogin(login = readln(), password = readln())
    if (isValid == false) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Привет Юзер!")
    }

}

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



fun validateLogin(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}