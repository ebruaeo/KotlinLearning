package Map

fun main() {
    var count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))
   println("2 in french is ${count[2]}")

    count.put(4,"quatre")
    println(count)
}