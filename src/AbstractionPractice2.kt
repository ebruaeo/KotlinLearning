fun main() {
val myOven : Oven = Bosch()
    val myRoaster: Oven = Roaster()

    myRoaster.cooking()
    myOven.cooking()
}

abstract class Oven {
    var cookingSpeed = 120
    open val averageTemperature = 100
    abstract fun cooking()
}

class Bosch : Oven() {
    override val averageTemperature = 210
    override fun cooking() {
        println("Bosch oven is cooking in $cookingSpeed minutes at $averageTemperature temperature")
    }
}

class Roaster: Oven(){
    override fun cooking() {
        println("A roaster roasts at $averageTemperature for $cookingSpeed minutes")
    }

}