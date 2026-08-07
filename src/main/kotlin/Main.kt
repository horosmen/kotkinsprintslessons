fun main() {
    print("Введите номер телефона: ")
    val phoneInput = readln().trim()

    val phoneNumber = try {
        phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println("Некорректный формат номера. Ошибка: ${e::class.simpleName}")
        null
    }

    // Если номер успешно распарсился — выводим его, иначе ничего не делаем
    phoneNumber?.let { validNumber ->
        println("Номер принят: $validNumber")
    } ?: run {
        // Этот блок нужен только если хочется явно обработать случай ошибки после let.
        // Но по сути вся обработка уже была в catch — здесь можно ничего не писать.
    }
}
