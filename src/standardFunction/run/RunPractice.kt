package standardFunction.run

fun main() {
    Restaurant().run {
        standardDish = "Fish and chips"
        todaysSpecial = "Fillet mignon"
        printMenu()
    }
}

class Restaurant{
    var standardDish =""
    var todaysSpecial = ""
    fun printMenu (){
        println("The standard dish is $standardDish")
        println("Todays speacial is $todaysSpecial")
    }
}