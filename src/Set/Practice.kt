package Set

fun main() {
    val colors = hashSetOf<String>()
    val colorsList = listOf("red", "green", "blue")
    colors.addAll(colorsList)
    println(colors)
    colors.remove("green")
    println(colors)

    val objects = hashSetOf("laptop", "mouse", "water", "cup", "phone")
    val removeObject = setOf("cup", "water")
    objects.removeAll(removeObject)
    println(objects)
}