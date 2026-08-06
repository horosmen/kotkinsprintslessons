class ContactRecord(val name: String, val phoneNumber: Long?, val company: String? = null) {
    fun print() {
        println("Имя: $name")
        println("Номер: ${phoneNumber ?: "<не указан>"}")
        println("Компания: ${company ?: "<не указано>"}")
        println()
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactRecord>()

    println("Введите контакты (для завершения введите пустую строку в поле имени):")

    while (true) {
        print("Имя: ")
        val name = readln().trim()
        if (name.isBlank()) break

        print("Номер телефона: ")
        var phoneInput = readln().trim()

        // Очищаем от лишних символов (+, пробелы, дефисы, скобки и т.п.)
        phoneInput = phoneInput.filter { it.isDigit() }

        val phoneNumber = if (phoneInput.isEmpty()) {
            println("⚠️ Номер телефона не введён. Запись не будет добавлена.\n")
            null
        } else {
            phoneInput.toLongOrNull()?.also {
                // Если toLongOrNull вернул число — всё ок
            } ?: run {
                println("⚠️ Введён некорректный номер телефона. Запись не будет добавлена.\n")
                null
            }
        }

        // Если номер невалиден (null) — пропускаем эту итерацию, но не прерываем цикл
        if (phoneNumber == null) continue

        print("Компания (можно оставить пустым): ")
        val companyInput = readln().trim()
        val company = if (companyInput.isBlank()) null else companyInput

        phoneBook.add(ContactRecord(name, phoneNumber, company))
        println("✅ Контакт добавлен.\n")
    }

    println("\n=== Телефонная книга ===")
    if (phoneBook.isEmpty()) {
        println("Телефонная книга пуста.")
    } else {
        phoneBook.forEach(ContactRecord::print)
    }
}
