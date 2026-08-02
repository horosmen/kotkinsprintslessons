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

        val userName = "Ilya"
        val morningGreeting = "Good Morning"
        val eveningGreeting = "Good Evening"

        var greeting: String

        greeting = morningGreeting
        println("$greeting, $userName!")

        greeting = eveningGreeting
        println("$greeting, $userName!")



