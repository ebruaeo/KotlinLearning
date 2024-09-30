package enum_classes

fun main() {
    val color = Colors.BLUE
    when(color){
        Colors.RED -> println("You chose red.")
        Colors.GREEN -> println("You chose green.")
        Colors.BLUE -> println("You chose blue.")
    }

    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
}

enum class Colors(val timesUsed: Int) {
    RED(12),
    GREEN(34),
    BLUE(9),
}

