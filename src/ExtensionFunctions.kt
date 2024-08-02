fun main() {
    val name = "Ebru"
    println(name.slim())

    println(name.getCustomName())
    println(3.getCustomName())
    println(2.5f.getCustomName())

    val list = arrayListOf(3,4,5,7,8,9,0,)
    println(list.howMany())
}

//normal function
fun slim(name: String) {

}

fun String.slim() = this.substring(1, length - 1)

fun String.slim2(): String {
    return this.substring(1, length - 1)
}

fun String.getCustomName() = "A string of characters"

fun Int.getCustomName() = "An integer number"

fun Float.getCustomName() = "A floating point number"

fun ArrayList<Int>.howMany () = "This list contains $size element"

