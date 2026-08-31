class Folder(
    private val folderName: String,
    private val fileCount: Int,
    private val isSecret: Boolean
) {

    val name: String
        get() {
            return if (isSecret) {
                "скрытая папка"
            } else {
                folderName
            }
        }

    val files: Int
        get() {
            return if (isSecret) {
                0
            } else {
                fileCount
            }
        }
}

fun main() {

    // Создаём скрытую папк
    val secretFolder = Folder(
        folderName = "Documents",
        fileCount = 25,
        isSecret = true
    )

    // Пытаемся прочитать данные
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.files}")
}