class Package(
    val number: String,
    location: String
) {

    var location: String = location
        set(value) {
            field = value
            moveCount++
        }

    var moveCount: Int = 0
        private set
}

fun main() {

    val parcel = Package(
        number = "PKG-12345",
        location = "Moscow"
    )

    println("Номер посылки: ${parcel.number}")
    println("Текущее местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.moveCount}")

    // Посылка прибыла в новый пункт
    parcel.location = "Saint Petersburg"

    println("\nПосылка прибыла в новый пункт:")
    println("Текущее местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.moveCount}")

    // Ещё одно перемещение
    parcel.location = "Helsinki"

    println("\nПосылка прибыла в ещё один пункт:")
    println("Текущее местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.moveCount}")
}