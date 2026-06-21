package org.example

import kotlin.random.Random

fun main() {
    val chars = "abcdefjhigklmnopqrstuvwxyz"
    val numbers = "0123456789"
    var password = ""
    for (i in 1..6) {
        if (i % 2 == 0) {
            password += numbers[Random.nextInt(numbers.length)]
        } else {
            password += chars[Random.nextInt(chars.length)]
        }
    }
    println(password)
}