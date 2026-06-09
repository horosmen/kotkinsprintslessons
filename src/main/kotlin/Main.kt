package org.example

const val TABLE_IN_RESTAURANT = 13
fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9
    val isAvailabilityOfTablesForToday = todayBooked < TABLE_IN_RESTAURANT
    val isAvailabilityOfTablesForTomorrow = tomorrowBooked < TABLE_IN_RESTAURANT
    println("[Доступность столиков на сегодня: $isAvailabilityOfTablesForToday]\n[Доступность столиков на завтра: $isAvailabilityOfTablesForTomorrow]")
}