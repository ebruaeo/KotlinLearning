package exercises

fun main() {
    var person = Person()
    person.showPersonDetail()

    var shape = Rectangle()
    shape.calculateArea()

    val student = Student()
    student.checkEligible()

    val animal = Animal()
    animal.makeAnimalSound()

    val costumer = Customer()
    costumer.sendEmail()
}

//? Write a Kotlin program that creates a class 'Person' with properties for name, age, and country.
// ? Include a function to print the person's details.

class Person {
    private val name = "Name"
    private val age = 20
    private val country = "England"

    fun showPersonDetail() {
        println("name: $name age: $age country: $country")
    }
}

//! Write a Kotlin program that creates a class 'Rectangle' with properties for width and height.
//! Include a function to calculate the rectangle area.

class Rectangle {
    private val width = 20
    private val height = 30

    fun calculateArea() {
        println("Rectangle's area is: ${width * height}")
    }
}

//!Write a Kotlin program that creates a class 'Student' with properties for name, age, and grade.
// ! Include a function to check if the student is eligible for promotion.


class Student {
    private val name = "Ali"
    private val age = 20
    private val grade = 90

    fun checkEligible() {
        if (grade < age) {
            println("$name is not eligible")
        } else {
            println("$name is eligible")
        }
    }
}

//!Write a Kotlin program that creates a class 'Animal' with properties for name and sound.
// !Include a function to make the animal's sound.

class Animal {
    private var name = readLine()
    private var sound = ""

    fun makeAnimalSound() {
        when (name) {
            "cat" -> println("$sound meow")
            "dog" -> println("$sound woof woof")
            "rooster" -> println("$sound cockedoodledo")
            "horse" -> println("$sound neigh")
            "pig" -> println("$sound oink")
        }
    }
}

//!Write a Kotlin program that creates a class 'Customer' with properties for name, email, and address.
// !Include a function to send a welcome email to the customer.

class Customer{
    private var name = readLine()
    private var email = readLine()
    private var address = readLine()

    fun sendEmail(){
        println("Sending email to $email")
        println("Welcome $name")
        println("Your address $address saved")

    }

}





