abstract class ForumUser(val username: String) {
    // Общее действие: чтение форума
    open fun readForum() {
        println("$username читает форум.")
    }

    // Общее действие: написание сообщения
    open fun postMessage(text: String) {
        println("$username пишет сообщение: $text")
    }

    // Абстрактные методы — их обязаны реализовать наследники, если нужны специфические действия
    abstract fun getRole(): String
}

class RegularUser(username: String) : ForumUser(username) {
    override fun getRole(): String = "Обычный пользователь"
}

class Admin(username: String) : ForumUser(username) {

    // Дополнительное действие: удаление сообщения
    fun deleteMessage(messageId: Int) {
        println("$username (администратор) удаляет сообщение №$messageId.")
    }

    // Дополнительное действие: удаление пользователя
    fun deleteUser(targetUsername: String) {
        println("$username (администратор) удаляет пользователя $targetUsername.")
    }

    override fun getRole(): String = "Администратор"
}

fun main() {
    val regular = RegularUser("Иван")
    val admin = Admin("Елена")

    // Действия обычного пользователя
    regular.readForum()
    regular.postMessage("Привет, ребята! Кто сегодня онлайн?")

    println("---")

    // Действия администратора
    admin.readForum()
    admin.postMessage("Объявление: сегодня будет техобслуживание.")
    admin.deleteMessage(105)
    admin.deleteUser("Петя_2000")
}
