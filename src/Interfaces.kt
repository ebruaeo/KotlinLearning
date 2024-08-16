fun main() {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()
}

interface Oven {
    val tempature: Int
    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp")
    }
}

class Bosch : Oven {
    override val tempature = 100

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }
}

fun getOven(): Oven{
    return Bosch()
}