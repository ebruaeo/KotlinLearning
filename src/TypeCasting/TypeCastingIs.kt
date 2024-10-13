package TypeCasting

fun main() {
    val value = "Testing my strings"
    if (value is String) {
        println("This string has ${value.length} characters")
    }



    val myCar : Car = getCar()
    if (myCar !is BMW){
        println("This is not my car")
    }
}

open class Car {}
class BMW: Car(){}


fun getCar (): Car = Car()