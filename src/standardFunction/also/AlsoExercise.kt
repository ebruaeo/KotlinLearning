package standardFunction.also

fun main() {
NewCar().apply {
    buildCar()
}
    .also {
        println("Log: Building car $it")
    }
}

class NewCar{
    fun buildCar(){
        println("Building a car")
    }
}