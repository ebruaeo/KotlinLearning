package TypeCasting


fun main() {



    val myCar: Car2 = getCar2()
//    if (myCar is BMW2) {
//        (myCar as BMW2).drive()
//    }

    val bmwCar = myCar as? BMW2
    bmwCar?.drive()
}

open class Car2 {}
class BMW2 : Car2() {
    fun drive(){
        println("Driving my BMW")
    }
}


fun getCar2(): Car2 = BMW2()