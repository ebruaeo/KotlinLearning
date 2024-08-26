package Map

fun main() {
    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    count.put(5,"five")
    count[5]= "five"
    println(count)


    val countMore = mapOf(Pair(6, "six"), Pair(10, "ten"))
    count.putAll(countMore)
    println(count)

    count.remove(2)
    println(count)

    count.replace(1,"oneone")
    println(count)

   // count.clear()
    //println(count)

    count.size
    count.containsKey(3)
    count.containsValue("three")
    count.isEmpty()
    count.isNotEmpty()

}