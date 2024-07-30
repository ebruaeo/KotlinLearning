//? vararg: variable number of arguments ( parameters)


fun main() {

    sayHello(
        "Mary",
        "Ali ",
        "Ela",
        "Mary",
        "Ali ",
        "Ela",
        "Mary",
        "Ali ",
        "Ela",
        "Mary",
        "Ali ",
        "Ela",
        "Mary",
        "Ali ",
        "Ela",
        "Mary",
        "Ali ",
        "Ela"
    ) //? you could put as many as ypu want here


    printHello(4, "Ali", "Mehmet", "kemal", "cemil", "ayşe")


}


fun sayHello(vararg names: String) {
    //? Its vararg type so names becomes a collection
    //? more than one parameter will be passed to this function
    for (name in names) {
        println("Hello $name")
    }
}

fun printHello(count: Int, vararg clientNames: String) {
    for (name in clientNames){
        for (i in 1..count){
            println("Hello $name - ")
        }
        println()
    }
}