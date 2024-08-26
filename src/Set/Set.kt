package Set

fun main() {

    //! Stores unique elements in an undefined order
    val numbers = setOf(6, 7, 6, 98)

    println(numbers)

    //! ıf we create an empty set, we must specify the type

    val numbers2 = setOf<Int>()
    println(numbers2)

    //! a set can contain a null element but only one
    val numbers3 = setOf(6, null, 7, 6, 98, null)
    println(numbers3)

    //? Set Functions
    numbers.size
    numbers.contains(4)
    numbers.containsAll(numbers2)
    numbers.isEmpty()


}
