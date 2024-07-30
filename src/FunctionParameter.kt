fun main() {
    val people = listOf("Anne", "Bob", "Carol")
    sayHello(people)

    doubleMessage(5, "5*2")
    doubleMessage(8)
}

fun sayHello(people: Collection<String>) {
    for (person: String in people) {
        println("Hello $person")
    }
}


// default value

fun doubleMessage(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}