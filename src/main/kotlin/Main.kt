package org.example

fun main() {

    val uppercases = ('A'..'Z').toList()
    val lowercase = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    println("Задайте длину пароля: ")
    val userInput = readln().toIntOrNull()
    if (userInput != null && userInput >= 6) {
        val passwordChars = mutableListOf<Char>()
        passwordChars.add(uppercases.random())
        passwordChars.add(lowercase.random())
        passwordChars.add(numbers.random())
        val allSymbols = uppercases + lowercase + numbers

        repeat(userInput - 3) {
            passwordChars.add(allSymbols.random())
        }

        passwordChars.shuffle()
        println(passwordChars.joinToString(""))
    }
    else {
        println("Пароль должен быть не менее 6 символов")
    }

}

