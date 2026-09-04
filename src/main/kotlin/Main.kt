// Базовый класс для животных (полиморфизм через наследование и абстракцию)
abstract class Animal(val name: String) {
    // Абстрактный метод: каждый подкласс сам решает, что выводит при еде
    abstract fun eat()
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    // Создаём по одному объекту каждого животного
    val fox = Fox("Алиса")
    val dog = Dog("Бобик")
    val cat = Cat("Мурка")

    // Список с принудительным указанием типа
    val animals: List<Animal> = listOf(fox, dog, cat)

    // В цикле вызываем метод приёма пищи для каждого экземпляра
    for (animal in animals) {
        animal.eat()
    }
}
