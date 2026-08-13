open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author)


class Chat {

    private val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        val message = Message(
            id = messages.size + 1,
            text = text,
            author = author
        )

        messages.add(message)
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int
    ) {
        val message = ChildMessage(
            id = messages.size + 1,
            text = text,
            author = author,
            parentMessageId = parentMessageId
        )

        messages.add(message)
    }

    fun printChat() {

        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) {
                it.parentMessageId
            } else {
                it.id
            }
        }

        for ((parentId, messageGroup) in groupedMessages) {

            val parentMessage = messageGroup.firstOrNull {
                it.id == parentId
            }

            if (parentMessage != null) {
                println("${parentMessage.author}: ${parentMessage.text}")

                messageGroup
                    .filter { it is ChildMessage }
                    .forEach {
                        println("\t${it.author}: ${it.text}")
                    }
            }
        }
    }
}


fun main() {

    val chat = Chat()

    chat.addMessage(
        text = "Hello everyone!",
        author = "Alice"
    )

    chat.addThreadMessage(
        text = "Hi Alice!",
        author = "Bob",
        parentMessageId = 1
    )

    chat.addThreadMessage(
        text = "Hello!",
        author = "Charlie",
        parentMessageId = 1
    )

    chat.addMessage(
        text = "How are you?",
        author = "Dave"
    )

    chat.addThreadMessage(
        text = "I'm fine!",
        author = "Alice",
        parentMessageId = 4
    )

    chat.printChat()
}