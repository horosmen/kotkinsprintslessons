// Перечисление возможных статусов участника
enum class Status {
    TALKING,
    MICROPHONE_OFF,
    MUTED
}

// Класс участника
data class Participant(
    val nickname: String,
    val avatar: String,
    var status: Status
)

// Класс комнаты
class Room(
    val cover: String,
    val title: String
) {

    // Изменяемый список участников
    private val participants = mutableListOf<Participant>()

    // Добавление участника
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    // Обновление статуса по имени пользователя
    fun updateStatus(nickname: String, newStatus: Status) {
        for (participant in participants) {
            if (participant.nickname == nickname) {
                participant.status = newStatus
                break
            }
        }
    }

    // Вывод информации о комнате
    fun printRoomInfo() {
        println("Комната: $title")
        println("Обложка: $cover")
        println("Участники:")

        for (participant in participants) {
            println(
                "${participant.nickname} | " +
                        "аватар: ${participant.avatar} | " +
                        "статус: ${participant.status}"
            )
        }
    }
}

fun main() {

    // Создаем комнату
    val room = Room(
        cover = "music.jpg",
        title = "Любители музыки"
    )

    // Создаем участников
    val user1 = Participant(
        nickname = "Иван",
        avatar = "ivan.png",
        status = Status.TALKING
    )

    val user2 = Participant(
        nickname = "Анна",
        avatar = "anna.png",
        status = Status.MICROPHONE_OFF
    )

    val user3 = Participant(
        nickname = "Петр",
        avatar = "petr.png",
        status = Status.MUTED
    )

    // Добавляем участников
    room.addParticipant(user1)
    room.addParticipant(user2)
    room.addParticipant(user3)

    println("До изменения статуса:")
    room.printRoomInfo()

    // Меняем статус Анны
    room.updateStatus("Анна", Status.TALKING)

    println()
    println("После изменения статуса:")
    room.printRoomInfo()
}