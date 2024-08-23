fun main() {
val container: Container2 = Bottle2()
    container.pour()
}


abstract class Container2 {
    abstract fun pour()
}

class Bottle2 : Container2() {
    fun fill() {
        println("Filling")
    }

    override fun pour() {
      println("Pouring Bottle")
    }
}

class Jug2 : Container2() {
    override fun pour() {
        println("Pouring Jug")
    }

}