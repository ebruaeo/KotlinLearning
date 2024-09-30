package nested_classes

fun main() {
    val myComputer = Coomputer()
    myComputer.bootUp()
}

class Coomputer {

    fun bootUp() {
        println("Booting up")
        val os = OperatingSystem()
        os.startOS()
        println("Computer is ready")
    }

    inner class OperatingSystem {
        fun startOS() {
            println("Os started")
        }
    }
}