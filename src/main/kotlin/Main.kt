class User2(val id: Int) {
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String? = null

    fun printInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Email: $email")
        println("About you: ${bio ?: "No bio available"}")
    }


    fun inputBio() {
        println("Input your bio:")
        bio = readln()
    }

    fun changePassword() {
        println("Enter current password:")
        if (readln() == password) {
            println("Enter new password")
            password = readln()
            println("The new password has been successfully changed.")
        } else {
            println("Password is not valid.")
        }
    }

}

fun main() {
    var user = User2(1)
    user.login = "admin"
    user.password = "admin"
    user.email = "admin@mail.ru"

    user.inputBio()
    user.changePassword()
    println("\nNew informaton")
    user.printInfo()
}