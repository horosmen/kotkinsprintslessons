class PhoneRecord(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun print() {
        println("Имя: ${name}\n"+
                "Номер: ${phoneNumber}\n"+
                "Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = listOf(
        PhoneRecord("Анна", 890004783221,null),
        PhoneRecord("БорисБритва", 89066666666,"Мафия"),
        PhoneRecord("Тони",8906666666454,null),
        PhoneRecord("Борис", 89006662345, "Google"),
        PhoneRecord("Дмитрий", 89009995678, "null")
    )
    val companies = phoneBook.mapNotNull { it.company }
    println(companies)

}


