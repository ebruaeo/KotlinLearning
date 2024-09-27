package standardFunction.let

fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
//        .let {
//            println(it)
//            println("Size of list is ${it.size}")
//        }
        .let (::println)


    val name  = readLine()
    name?.let {
        println("Your name is $name")
    }
}