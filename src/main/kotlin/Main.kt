class QuizItem(questionText: String, answerText: String) {
    // Свойство для вопроса — только с геттером (по умолчанию val)
    val question: String = questionText

    // Свойство для ответа — с явными геттером и сеттером
    var answer: String = answerText
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val item = QuizItem("Какой язык программирования используется для Android?", "Kotlin")

    println("Вопрос: ${item.question}")
    println("Ответ: ${item.answer}")

    // Пример изменения ответа через сеттер
    item.answer = "Java или Kotlin"
    println("Обновлённый ответ: ${item.answer}")
}
