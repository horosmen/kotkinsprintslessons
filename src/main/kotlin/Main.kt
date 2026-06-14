package org.example

// Константа с возрастом совершеннолетия
const val LEGAL_AGE = 18
fun main() {
    // Получаем текущий год
    val currentYear: Int = java.time.Year.now().value
    // Запрашиваем у пользователя год рождения
    print("Введите год рождения: ")
    val birthYear = readln().toInt()
    // Вычисляем возраст пользователя
    val age = currentYear - birthYear
    // Проверяем условие совершеннолетия и выводим соответствующее сообщение
    if (age >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ к скрытому контенту ограничен: возраст меньше $LEGAL_AGE лет.")
    }
}
