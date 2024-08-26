fun main() {
    val name = "Ebru"
    println(name.betterlength)
}

//the properties that we extend cannot be local, i.e. this declared inside a function or a class.
val String.betterlength: Int
    get() = 200
//    get() {
//        println("Getting the better length")
//        return 200
//    }