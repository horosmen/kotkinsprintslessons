package org.example

fun main() {
    val days = IntArray(7)
    for (i in days.indices) {
        println("Введите сколько вы посмотрели рекламы сегодня: ")
        days[i] = readln().toInt()
    }
    println("На этой неделе вы посмотрели: ${days.sum()}")

}