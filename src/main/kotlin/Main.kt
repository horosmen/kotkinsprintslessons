package org.example

fun main() {
    val input = "D2-D4;0"

    // Разделяем строку по точке с запятой — получаем ход и номер
    val (move, turnNumber) = input.split(";")
    // Разделяем ход по дефису — получаем исходную и целевую клетку
    val (from, to) = move.split("-")
    // Преобразуем номер хода в число


    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $turnNumber")
    }


