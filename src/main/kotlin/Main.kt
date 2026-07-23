// ForumUser – только Forum может создавать экземпляры
class ForumUser private constructor(
    val userName: String,
    val userId: Int,
) {
    // Приватный builder – доступен только внутри этого файла (или класса)
    private class Builder {
        private var userName: String = ""
        private var userId: Int = 0

        fun setUserName(name: String) = apply { userName = name }
        fun setUserId(id: Int) = apply { userId = id }
        fun build() = ForumUser(userName, userId)
    }

    companion object {
        // Внутренний метод для Forum
        internal fun create(userName: String, userId: Int): ForumUser {
            return Builder()
                .setUserName(userName)
                .setUserId(userId)
                .build()
        }
    }
}

// Аналогично для ForumMessage
class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    private class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(id: Int) = apply { authorId = id }
        fun setMessage(msg: String) = apply { message = msg }
        fun build() = ForumMessage(authorId, message)
    }

    companion object {
        internal fun create(authorId: Int, message: String): ForumMessage {
            return Builder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
        }
    }
}

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumUser {
        val user = ForumUser.create(userName, nextUserId) // вызываем внутренний метод
        users.add(user)
        nextUserId++
        return user
    }

    private fun findUserById(userId: Int): ForumUser? = users.find { it.userId == userId }

    fun createNewMessage(authorId: Int, message: String) {
        if (findUserById(authorId) == null) return
        val msg = ForumMessage.create(authorId, message)
        messages.add(msg)
    }

    fun printThread() {
        for (msg in messages) {
            val author = findUserById(msg.authorId) ?: continue
            println("${author.userName}: ${msg.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user2.userId, "Привет, Bob!")

    // Теперь следующий код НЕ скомпилируется:
    // val hacker = ForumUser.Builder().setUserId(999).setUserName("Hacker").build()


    forum.printThread()
}