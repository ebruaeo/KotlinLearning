package sealed_classes

fun main() {

    val someplant = getPlant()

    when (someplant) {
        is Fruit -> println("Sweet")
        is Vegetable -> println("Tasty")
    }
}

fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit : Plant()

sealed class Vegetable : Plant()

class Apple : Fruit()

class Patato : Vegetable()
