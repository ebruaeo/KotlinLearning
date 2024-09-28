package standardFunction.apply

fun main() {
    val myCar = MyCar().apply {
        speed = 50
        color = "Red"
        startCar()
    }
    println(myCar)
}

class MyCar{
    var speed = 10
    var color = "blue"
    fun startCar (){
        println("Starting car, speed is $speed color is $color")
    }
}