//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Base class
open class Animal(val name: String) {
    open fun sound() {
        println("$name makes a sound.")
    }
}

// Abstract class
abstract class Mammal(name: String) : Animal(name) {
    abstract fun walk()
}

// Interface
interface Pet {
    fun play()
}

// Derived class Dog
class Dog(name: String) : Mammal(name), Pet {
    override fun sound() {
        println("$name barks.")
    }

    override fun walk() {
        println("$name is walking.")
    }

    override fun play() {
        println("$name loves to play fetch.")
    }
}

// Derived class Cat
class Cat(name: String) : Mammal(name), Pet {
    override fun sound() {
        println("$name meows.")
    }

    override fun walk() {
        println("$name walks gracefully.")
    }

    override fun play() {
        println("$name enjoys playing with a ball of yarn.")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.sound()      // Output: Buddy barks.
    dog.walk()       // Output: Buddy is walking.
    dog.play()       // Output: Buddy loves to play fetch.

    val cat = Cat("Whiskers")
    cat.sound()      // Output: Whiskers meows.
    cat.walk()       // Output: Whiskers walks gracefully.
    cat.play()       // Output: Whiskers enjoys playing with a ball of yarn.
}
