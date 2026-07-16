const val LOGIN = "admin"
const val PASSWORD = "12345"

val cart = listOf("Наушники", "Ноутбук", "Смарт-часы")
val userLogin = "admin"
val userPassword = "12345"
private const val TOKEN_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

fun main() {
    val token = authorize(userLogin, userPassword)
    val basket = getCart(token)
    if (basket == null) {
        println("Авторизация не удалась")
    } else {
        println("Товары в корзине:")

        for (item in basket) {
            println(item)
        }
    }
}


fun authorize(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) {
        var token = ""
        repeat(32) {
            token += TOKEN_CHARS.random()

        }
        return token
    } else {
        return null
    }
}

fun getCart(token: String?): List<String>? {

    if (token == null) {
        return null
    }

    return cart
}

