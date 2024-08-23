fun main() {
    //! We cant create object like this
    // val container = Container()
    val container: Container = Bottle()
    container.pour()
    //! container.fill() doesnt work
}

abstract class Container {
    fun pour() {
        println("Pouring Liquid")
    }
}

class Bottle : Container() {
fun fill(){
    println("Filling")
}
}

class Jug : Container() {

}