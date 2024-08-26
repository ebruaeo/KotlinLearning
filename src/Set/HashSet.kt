package Set

fun main() {
    var numbers = hashSetOf(3,7,8,null)
    val noNumbers = hashSetOf<Int>()
    println(numbers)
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    var newNumbers = setOf(23,45,67,3,7)
    numbers.addAll(newNumbers)
    println(numbers)

    numbers.remove(45)
    println(numbers)

    val toRemove = setOf(3,7,8,87654)
    numbers.removeAll(toRemove)
    println(numbers)

    //? Intersect
    numbers = hashSetOf(3,7,8,null)
    newNumbers = setOf(23,45,67,3,7)
    println(numbers.intersect(newNumbers))

    numbers.clear()
    println(numbers)
}