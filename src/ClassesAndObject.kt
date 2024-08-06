fun main() {
    val animal: ArrayList<String> = arrayListOf<String>()
    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()
}

class Table {
    val color : String = "white"
}

class Car2 {
    fun drive(){
        println("Driving along in my car")
    }
}

class Garage{
    val car = Car2()
}