class Engine3 {
    fun start() {
        println("Engine started")
    }
}

class Car3 {
    private lateinit var engine: Engine3

    fun setEngine(engine: Engine3) {
        this.engine = engine
    }

    fun drive() {
        engine.start()
        println("Car is driving")
    }
}



fun main() {
    val engine = Engine3()  // Dependency
    val car = Car3()        // Car object created
    car.setEngine(engine)  // Injecting dependency via setter method
    car.drive()


}
