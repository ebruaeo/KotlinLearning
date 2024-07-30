//* Local function is a function inside a function


fun main() {
    listAnimals()
    askName()
}

fun listAnimals() {
    fun listOneAnimal(animal: String) { // noone else outside this function needs this function
        println("I have a $animal")
    }

    val myAnimals = arrayListOf("cat", "bird", "dog", "elephant")
    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}

fun askName() {
    fun printGreetings(name: String) {
        println("Hello $name")
    }
    while (true) {
        println("Enter a name")
        val input = readLine() ?: ""
        if (input == "") break

        printGreetings(input)
    }


}