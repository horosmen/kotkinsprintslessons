class User(val id: Int) {
    var login: String = ""
    var password: String = ""
    var email: String = ""
}

fun userOne() {
    val user = User(id = 1)
    user.login = "admin"
    user.password = "admin"
    user.email = "horos030590@mail.ru"
   println("Welcome ${user.id}, ${user.login}! you email ${user.email}")
}

fun userTwo() {
    val user = User(id = 2)
    user.login = "admin"
    user.password = "admin"
    user.email = "yandex.ru"
    println("Welcome ${user.id}, ${user.login}! you email ${user.email}")
}

fun main() {
    userOne()
    userTwo()
}