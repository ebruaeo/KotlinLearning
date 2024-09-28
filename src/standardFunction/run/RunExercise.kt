package standardFunction.run

fun main() {
    run {
        var laptop = Laptop()
        laptop.turnOff()
        laptop.turnOn()
    }
}

class Laptop {
    fun turnOn() {
        println("Turning on laptop")
    }

    fun turnOff() {
        println("Turning off laptop")
    }
}