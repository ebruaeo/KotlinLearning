import kotlinx.coroutines.processNextEventInCurrentThread

interface Engine {
    fun start()
    fun stop()
}

class PetrolEngine : Engine {
    override fun start() {
        println("Petrol Engine started")
    }

    override fun stop() {
        println("Petrol Engine stopped")
    }
}

class ElectricEngine : Engine {
    override fun start() {
        println("Electric Engine Started")
    }

    override fun stop() {
        println("Electric Engine stopped")
    }
}


class Car(private val engine: Engine) {  // Loosely coupled through constructor injection
    lateinit var name: String
    fun drive() {
        engine.start()
        println("$name is driving")
        engine.stop()
    }
}

fun main() {
    val petrolEngine = PetrolEngine()
    val electricEngine = ElectricEngine()
    val testCar1 = Car(petrolEngine) // Dependency is injected, no direct coupling
    testCar1.name = "Clio"
    testCar1.drive()
    val testCar2 = Car(electricEngine)
    testCar2.name = "Tesla"
    testCar2.drive()
}

