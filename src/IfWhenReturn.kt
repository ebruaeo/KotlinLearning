fun main() {

    //*******Example 1 *****************
    println("Do you have the keys? (yes/no)")
    var input = readLine() ?: ""
    var hasKeys = input.toBoolean()
    if (hasKeys) {
        println("Start the car")
    } else {
        println("Cannot start the car without keys")
    }


    //*******Example 2 ****************
    println("Do you have the keys? (yes/no)")
    input = readLine() ?: ""
    hasKeys = false
    if (input == "yes") {
        hasKeys = true
    }
    if (hasKeys) {
        println("Start the car")
    } else {
        println("Cannot start the car without keys")
    }


    //*******Example 3 ****************

    val hasEggs = true
    val hasBacon = false
    var eggsCost = 5
    var baconCost = 20
    var payment = 0

    if (hasEggs) {


    }
    println(isEven(5))
}

fun isEven(i: Int): String {
    return when (i % 2 == 0) {
        true -> "$i is even"
        false -> "$i is not even"
    }
}

fun isEven2(i: Int): String {
    return when {
        i % 2 == 0 -> "$i is even"
        i % 2 != 0 -> "$i is not even"
        else -> "error"
    }
}

fun doubleIfEven(d: Double): Double {
    return if (d % 2 == 0.0){
        val x = d*2
        x
    } else  {
        d
    }
}

