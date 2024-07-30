fun main() {
    for (i in 1..3) {
//        multiply()
//        askNameAndBirthYear()
    }
    println("Enter an animal")
    val input = readLine() ?: ""
   println(getLifespan(input))


}

//fun multiply() {
//    println("Enter a number")
//    val input = readLine() ?: ""
//    val number = input.toInt()
//    println("$number * 17 = ${number * 17}")
//}

//fun askNameAndBirthYear() {
//    println("name:")
//    var input = readLine() ?: ""
//    val name = input.toString()
//    println("Birth Year:")
//    input = readLine() ?: ""
//    val year = input.toInt()
//    println("name: $name and birth year: $year")
//}


fun getLifespan(animal: String): Int {
    val lifespan = when (animal) {
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifespan
}