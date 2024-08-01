fun main() {
    var clients = listOf("Anna", "William", "Emily", "Bob")

    clients.forEach { println("hello $it") }


    clients.filter { it.length < 5 }
        .forEach { println("Hello $it") }


    val sizes = clients.map { it.length }
    println(sizes)


    val sorted = clients.sortedBy { it.length }
    println(sorted)


    val max = clients.maxBy { it.length }
    println(max)


    val min = clients.minBy { it.length }
    println(min)

    //? given a set of random integers, print out a subset that consists only of double digit integers.

    val number = setOf(3, 456, 34, 67, 4, 567, 39, 6575)
    println(number.filter { it >= 10 && it <= 99 })

    //?you have a list of clients from your online store display, a list that is sorted by the last letter of their name.
    clients = listOf("Anna", "William", "Emily", "Bob", "Dennis")
    println(clients.sortedBy { it[it.length - 1] })

    //?is given a list of three digit integers. Print out the integer that has the biggest middle digit.
    val ints = listOf(356, 987, 123, 568, 234, 699)
    println(ints.maxBy { it.toString()[1].toInt() })
    //   println(ints.maxBy { it / 10 % 10 })

    val randomInt = arrayListOf(34, 67, 76, 45, 3435, 345, 67)
    for (i in randomInt.indices) {
        if (randomInt[i] % 2 == 0) {
            randomInt[i] = randomInt[i] / 2
        } else {
            randomInt[i] = randomInt[i] * 2
        }
    }
    println(randomInt.filter { it > 25 })

}

