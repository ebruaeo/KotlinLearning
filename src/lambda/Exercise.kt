package lambda


fun main() {
    multiply(13, 35)
    squareNumber(12)
    evenNumber(4567)
    average()
    lambda()
    lambda2()
    lambda3()
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














