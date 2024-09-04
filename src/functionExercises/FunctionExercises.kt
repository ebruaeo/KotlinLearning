package functionExercises

fun main() {
    printMessage("Ebru")
    printMessage("Mia")
    printMessage("Minnie")

    var array = arrayOf(1, 2, 3, 5, 6, 7, 9, 5, 56, 88, 0, 4567, 90)
    printEvenNumbers(array)

    countVowels("ebru eve geldi.")

    reverseString("Ebru")

    println(calculateArea(2.5, 6.8))

    println(calculateCircle(26))

    printNumbers(60)

    println(checkPrime(5))
}

//? Write a Kotlin function that takes a 'name' as an argument
// ?and prints a personalized greeting message to the user.
fun printMessage(name: String) {
    println("Hello $name")
}

//?Write a Kotlin function that takes an array of integers and prints only even numbers.

fun printEvenNumbers(array: Array<Int>) {
    for (i in array) {
        if (i % 2 == 0) {
            print("$i, ")
        }
    }
    println()
}

//?Write a Kotlin function `countVowels` that counts the number of vowels in a given string.
fun countVowels(string: String) {
    val str = "aeıioöuüAEIİOÖUÜ"
    var count = 0
    for (i in string) {
        if (str.contains(i)) {
            count++
        }
    }
    println(count)
}

fun reverseString(string: String) {
    for (i in string.lastIndex downTo 0) {
        print(string[i])
    }
    println()
}

//?Write a Kotlin function that calculates and returns the area of a rectangle.
// ?It should take 'length' and 'width' as arguments, with default values of 0.0.

fun calculateArea(length: Double = 0.0, width: Double = 0.0): Double {
    val area = length * width
    return area
}

fun calculateCircle(cap: Int, pi: Double = 3.14): Double {
    val area = pi * (cap / 2)
    return area
}

//? Write a Kotlin function that takes an integer n as an argument and prints the numbers from 1 to n on separate lines.
//? The function should return Unit.

fun printNumbers(n: Int): Unit {
    for (i in 1..n) {
        println(i)
    }

}

//? Write a Kotlin function that takes an integer as an argument
// ?and returns a Boolean indicating whether the number is prime or not.

fun checkPrime(n: Int): Boolean {
    var isPrime = true
    for (i in 2..n) {
        if (n % i == 0) {
            isPrime = false
        } else {
            isPrime = true
        }
    }
    return isPrime
}


























