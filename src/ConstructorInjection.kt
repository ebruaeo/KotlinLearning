class Engine2 {
    fun start() {
        println("Engine started")
    }
}

class Car2(private val engine: Engine2) {
    fun drive() {
        engine.start()
        println("Car is driving")
    }
}

fun main() {
    val engine = Engine2()  // Dependency
    val car = Car2(engine)  // Injecting dependency via constructor
    car.drive()
}
