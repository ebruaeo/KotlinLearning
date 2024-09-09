package lambda


fun main() {
    multiply(13, 35)
    squareNumber(12)
    evenNumber(4567)
    average()
    lambda()
    lambda2()
    lambda3()
    facLambda(7)
    findMaxLambda(arrayListOf(23, 45, 12, 78, 0))
    countVowels("Ömer")
    sumOddNumbers(arrayListOf(3, 1, 12, 7, 0))
    conStrings("minnie", "Mia")
    averageSquare(arrayListOf(2,4,5,6))
}


//? Write a Kotlin program that
//? implements a lambda expression to multiply two numbers and return the result.
val multiply = { n1: Int, n2: Int -> println(n1 * n2) }

//* Write a Kotlin program that
//* implements a lambda expression to find the square of a number and return the result.

val squareNumber = { n1: Int -> println(n1 * n1) }

//?Write a Kotlin program that implements a lambda expression to check if a number is even.
val evenNumber = { n1: Int ->
    if (n1 % 2 == 0) {
        println("Number is even")
    } else {
        println("Number is odd")
    }
}

//*Write a Kotlin program that implements a lambda expression to calculate the average of a list of numbers.

var list = arrayListOf(23, 45, 12, 78, 0)
var sum = 0
val average = {
    for (i in list) {
        sum += i
    }
    println(sum / list.size)
}

//?Write a Kotlin program that implements a lambda expression to filter a list of strings.
//? It returns only strings starting with the letter 'K'.

val stringList = arrayListOf("Ebru", "Kitap", "Kahve", "Minnie", "Mia", "Ömüş", "Su", "Kar", "Pc")
val kList = arrayListOf<String>()
val lambda = {
    for (i in stringList) {
        if (i.startsWith('K')) {
            kList.add(i)
        }
    }
    println(kList)
}

//*Write a Kotlin program that
//* implements a lambda expression to sort a list of integers in descending order.

var list2 = arrayListOf(23, 45, 12, 78, 0)
val lambda2 = { println(list2.sorted()) }

//? Write a Kotlin program that implements a lambda expression to convert a list of strings to uppercase.

val stringList2 = arrayListOf("Ebru", "Kitap", "Kahve", "Minnie", "Mia", "Ömüş", "Su", "Kar", "Pc")
val upperCaseList = arrayListOf<String>()
val lambda3 = {
    for (i in stringList2) {
        upperCaseList.add(i.uppercase())
    }
    println(upperCaseList)
}

//?Write an anonymous Kotlin function to check if a string is a palindrome.

//!Write an anonymous Kotlin function to calculate the factorial of a number.
val facLambda = { number: Int ->
    var fact = 1
    for (i in number downTo 1) {
        fact *= i
    }
    println(fact)
}

//?Write an anonymous Kotlin function to find the maximum element in an array.
val findMaxLambda = { list: List<Int> ->
    var max = list[0]
    for (i in list) {
        if (i > max) {
            max = i
        }
    }
    println("Maximum element $max")
}

//!Write an anonymous Kotlin function to count the number of vowels in a string.
var vowels = "aeıioöuüAEIİOÖUÜ"
var countVowels = { str: String ->
    var count = 0
    for (i in str) {
        if (vowels.contains(i)) {
            count++
        }
    }
    println("Vowels = $count")
}

//? Write an anonymous Kotlin function to calculate the sum of all odd numbers in a list.

val sumOddNumbers = { list: List<Int> ->
    var sum = 0
    for (i in list) {
        if (i % 2 != 0) {
            sum += i
        }
    }
    println("Odd numbers sum = $sum")
}


//!Write an anonymous Kotlin function to concatenate two strings and return the result.

val conStrings = { str: String, str2: String ->
    var result = str + str2
    println(result)
}

//?Write an anonymous Kotlin function to find the average of the squares of a list of numbers.

val averageSquare = { list: List<Int> ->
    var squareList = arrayListOf<Int>()
    for (i in list) {
        squareList.add(i * i)
    }
    var sum = 0
    for (j in squareList) {
        sum += j
    }
    var average = sum / squareList.size
    println("Square list average = $average")
}













