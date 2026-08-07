class ContactEntry(val name: String, val phoneNumber: Long?, val company: String? = null) {
    fun print() {
        println("Имя: $name")
        println("Номер: ${phoneNumber ?: "<не указан>"}")
        println("Компания: ${company ?: "<не указано>"}")
        println()
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactEntry>()

    println("Введите контакты (для завершения введите пустую строку в поле имени):")

    while (true) {
        print("Имя: ")
        val name = readln().trim()
        if (name.isBlank()) break

        print("Номер телефона: ")
        val phoneInput = readln().trim()

        // Не фильтруем: пробуем распарсить «как есть» — именно это и проверяет задачу
        val phoneNumber = try {
            phoneInput.toLong()
        } catch (e: NumberFormatException) {
            println("Некорректный номер телефона. Ошибка: ${e::class.simpleName}")
            null
        }

        // Если номер невалиден (null) — пропускаем добавление, цикл продолжается
        phoneNumber?.let { validNumber ->
            print("Компания (можно оставить пустым): ")
            val companyInput = readln().trim()
            val company = if (companyInput.isBlank()) null else companyInput

            phoneBook.add(ContactEntry(name, validNumber, company))
            println("Контакт добавлен.")
        }
    }

    println()
    println("=== Телефонная книга ===")
    if (phoneBook.isEmpty()) {
        println("Телефонная книга пуста.")
    } else {
        phoneBook.forEach(ContactEntry::print)
    }
}

