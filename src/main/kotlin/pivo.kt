package org.example

fun main() {
    println("Пожалуйста зарегистрируйтесь Введите логин: ")
    val newLoginUser = readln()
    println("Введите пароль: ")
    val newPasswordUser = readln()
    do {
        println("Введите зарегистрированный логин и пароль чтобы войти в программу:")
        val login = readln()
        val password = readln()
        if (login == newLoginUser && password == newPasswordUser) {
            println("Авторизация прошла успешно")
        }
    } while (login != newLoginUser || password != newPasswordUser)
}