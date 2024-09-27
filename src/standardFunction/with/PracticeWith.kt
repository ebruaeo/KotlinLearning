package standardFunction.with

fun main() {
    with(Person()){
        firstName = "Ebru"
        lastName = "Okumuş"
        age = 25
        printPersonInfo()
    }
}

class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printPersonInfo(){
        println("$firstName $lastName is $age years old.")
    }
}