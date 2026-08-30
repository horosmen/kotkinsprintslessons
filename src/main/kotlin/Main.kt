class QuizItem(questionText: String, answerText: String) {
    // Свойство для вопроса — с явно прописанным геттером
    var question: String = questionText
        get() = field

    // Свойство для ответа — с явно прописанными геттером и сеттером
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
