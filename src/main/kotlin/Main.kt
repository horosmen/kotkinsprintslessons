fun main() {
    print("Введите номер телефона: ")
    val phoneInput = readln()  // без trim() — пробелы считаются частью строки и делают её невалидной для toLong()

    val phoneNumber = try {
        phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println("Некорректный формат номера. Ошибка: ${e::class.simpleName}")
        null
    }

    phoneNumber?.let { validNumber ->
        println("Номер принят: $validNumber")
    }
}
