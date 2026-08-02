class Directory(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun print() {
        println("Имя: ${name}\n"+
                "Номер: ${phoneNumber}\n"+
                "Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val directoryAnna = Directory("Анна", 890005554442, null)
    directoryAnna.print()
}


