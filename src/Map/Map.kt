package Map

fun main() {
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    //! Empty Map
    var count2 = mapOf<Int, String>()
    println(count2)

    println(count.get(2))
    println(count[2])

    println(count.keys)
    println(count.values)
}