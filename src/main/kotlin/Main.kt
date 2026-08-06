class ContactRecord(val name: String, val phoneNumber: String, val company: String? = null) {
    fun print() = println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}\n")
}

fun main() {
    val phoneBook = generateSequence {
        print("Имя: ")
        val name = readln().trim().takeIf { it.isNotBlank() } ?: return@generateSequence null

        print("Номер телефона: ")
        var phoneInput = readln().trim()

        // Удаляем всё, кроме цифр
        phoneInput = phoneInput.filter { it.isDigit() }

        if (phoneInput.isEmpty()) {
            println("⚠️ Номер телефона не введён. Запись не будет добавлена.\n")
            return@generateSequence null
        }

        print("Компания (можно оставить пустым): ")
        val companyInput = readln().trim()
        val company = companyInput.takeIf { it.isNotBlank() }

        ContactRecord(name, phoneInput, company)
    }.toList()

    println("\n=== Телефонная книга ===")
    if (phoneBook.isEmpty()) println("Телефонная книга пуста.")
    else phoneBook.forEach(ContactRecord::print)
}
