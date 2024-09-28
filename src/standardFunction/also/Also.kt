package standardFunction.also

fun main() {
    Car().apply {
        speed = 80
        run()

    }
        .also {
            println("Car is running")
            println("Car speed is ${Car().speed}")
        }
}

class Car {
    var speed = 0
    fun run (){

    }
}