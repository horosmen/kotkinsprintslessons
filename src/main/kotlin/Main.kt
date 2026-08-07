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

        val phoneNumber = if (phoneInput.isEmpty()) {
            println("Номер не введён. Запись не будет добавлена.")
            null
        } else {
            try {
                phoneInput.toLong()
            } catch (e: NumberFormatException) {
                println("Некорректный формат номера. Ошибка: ${e::class.simpleName}")
                null
            }
        }

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
