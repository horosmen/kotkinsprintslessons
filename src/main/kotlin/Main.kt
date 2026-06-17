package org.example

fun main() {
    println("Пожалуйста зарегистрируетесь Введите логин: ")
    val newLoginUser = readln()
    println("Введите пароль: ")
    val newPasswordUser = readln()
    val loginUser = newLoginUser
    val passwordUser = newPasswordUser

    do {
        println("Введите зарегистрированный логин и пароль чтобы войти в программу:")
        var login = readln()
        var password = readln()
        if (login == loginUser && password == passwordUser) {
            println("Авторизация прошла успешно")
        }
    } while (login != loginUser || password != passwordUser)
}