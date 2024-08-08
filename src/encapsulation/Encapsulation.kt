package encapsulation

fun main() {

}

//?open class Airplane {
//?   private val type = "Airbus"
//?
//?    private fun fly() {
//?        println("flying")
//?    }
//?}

//!open class Airplane {
// !   protected val type = "Airbus"
//!
// !   protected fun fly() {
//  !      println("flying")
//   ! }
//!}

//*open class Airplane {
// *   internal val type = "Airbus"
//*
// *   internal fun fly() {
//  *      println("flying")
//   * }
//*}

open class Airplane {
    public val type = "Airbus"

    public fun fly() {
        println("flying")
    }
}


class MyAirplane : Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}