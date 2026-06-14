package org.example

// Константа с возрастом совершеннолетия
const val LEGAL_AGE = 18
fun main() {
    // Получаем текущий год
    val currentYear = 2026
    // Запрашиваем у пользователя год рождения
    println("Введите год рождения: ")
    val birthYear = readln().toInt()
    // Вычисляем возраст пользователя
    val age = currentYear - birthYear
    // Проверяем условие совершеннолетия и выводим соответствующее сообщение
    if (age >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    }
}
