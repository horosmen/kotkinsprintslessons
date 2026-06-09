package org.example

const val TABLE_IN_RESTORANT = 13
fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9
    val isAvailabilityOfTablesForToday = todayBooked < TABLE_IN_RESTORANT
    val isAvailabilityOfTablesForTomorrow = tomorrowBooked < TABLE_IN_RESTORANT
    println("Доступность столиков на сегодня: $isAvailabilityOfTablesForToday\nДоступность столиков на завтра: $isAvailabilityOfTablesForTomorrow")
}