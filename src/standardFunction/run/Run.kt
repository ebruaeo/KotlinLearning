package standardFunction.run


fun main() {
    Car().run {
        speed = 70
        drive()
    }

    run {
        val car = Car()
        car.speed = 100
        car.drive()
    }
}
class Car{
    var speed = 10
    fun drive(){
        println("Car is driving $speed")
    }
}