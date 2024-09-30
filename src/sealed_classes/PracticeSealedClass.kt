package sealed_classes

fun main() {
    val myVehicle = getVehicle()

    when(myVehicle) {
        is Car -> println("A car is faster")
        is Bicycle -> println("Bicycler is healthy")
    }
}

fun getVehicle(): Vehicle = Pegasus()

abstract class Vehicle

sealed class Car : Vehicle()

sealed class Bicycle : Vehicle()

class BMW: Car()

class Pegasus: Bicycle()