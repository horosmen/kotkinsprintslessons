// Интерфейсы для типов передвижения
interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

// Классы существ
class Carp : Swimmable {
    override fun swim() {
        println("Карась плывёт в воде.")
    }
}

class Seagull : Flyable, Swimmable {
    override fun fly() {
        println("Чайка парит в небе.")
    }

    override fun swim() {
        println("Чайка скользит по воде.")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летит над озером.")
    }

    override fun swim() {
        println("Утка плавает и ныряет.")
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()


    carp.swim()

    seagull.fly()
    seagull.swim()

    duck.fly()
    duck.swim()
}
