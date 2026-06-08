package org.example

fun main() {
// Шаг 1. Инициализация переменных для первого хода
    var from: String = "E2"     // Начало позиция
    var to: String = "E4"       // Конечная позиция
    var moveNumber: Int = 1     // Номер хода

// Шаг 2 формирование строки хода
    val moveString: String = "$from-$to;$moveNumber"
    println(moveString)

// Шаг 3 Следующий ход
    from = "D2"
    to = "D3"
    moveNumber++

// Шаг 4 формирование строки хода
    val nextMoveString = "$from-$to;$moveNumber"
    println(nextMoveString)

}