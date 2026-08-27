class Player private constructor(
    val name: String,
    private var health: Int,
    private var damage: Int
) {
    private var isDead = false

    companion object {
        fun create(name: String, health: Int, damage: Int): Player {
            require(name.isNotBlank()) { "Имя не может быть пустым" }
            require(health > 0) { "Здоровье должно быть положительным" }
            require(damage >= 0) { "Сила удара не может быть отрицательной" }
            return Player(name, health, damage)
        }
    }

    // Приватный метод — вызывается при смерти
    private fun onDeath() {
        check(!isDead) { "Игрок уже мёртв" }
        isDead = true
        health = 0
        damage = 0
        println("💀 $name погиб! Здоровье и сила удара обнулены.")
    }

    fun takeDamage(amount: Int) {
        require(amount >= 0) { "Урон не может быть отрицательным" }
        check(!isDead) { "Нельзя нанести урон мёртвому игроку" }

        println("💥 $name получает урон: $amount ед.")
        health -= amount

        if (health <= 0) {
            health = 0
            onDeath()
        } else {
            println("❤️ Текущее здоровье $name: $health")
        }
    }

    fun heal(amount: Int) {
        require(amount >= 0) { "Лечение не может быть отрицательным" }
        check(!isDead) { "Нельзя лечить мёртвого игрока" }

        val oldHealth = health
        health += amount
        println("💚 $name лечится на $amount ед. (было: $oldHealth, стало: $health)")
    }

    fun getStats() = "Игрок: $name | Здоровье: $health | Сила удара: $damage | Жив: ${!isDead}"
}

fun main() {
    // Создаём игрока через фабрику (конструктор приватный — напрямую не выйдет)
    val hero = Player.create(name = "Воин", health = 50, damage = 15)

    println(hero.getStats())
    println()

    // Имитация боя
    hero.takeDamage(20)   // здоровье: 30
    hero.heal(10)         // здоровье: 40
    hero.takeDamage(35)   // здоровье: 5
    hero.heal(20)         // здоровье: 25
    hero.takeDamage(30)   // здоровье: 0 → смерть

    println()
    println(hero.getStats())

    // Попытки действий после смерти — остановятся на check(...)
    hero.heal(50)
    hero.takeDamage(10)
}
