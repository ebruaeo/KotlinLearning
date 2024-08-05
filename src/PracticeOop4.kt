fun main() {
    val n = Calculator()
    n.addNumber(47.0)
    n.mulNumber(15.0)
    n.subNumber(47.0)
    n.divNumber(47.0)
    n.resetTotal()


}

class Calculator {
    var total = 0.0

    fun addNumber(a: Double) {
        total += a
        println("+ $a")
        println("= $total")
    }

    fun subNumber(a: Double) {
        total -= a
        println("- $a")
        println("= $total")
    }

    fun mulNumber(a: Double) {
        total *= a
        println("* $a")
        println("= $total")
    }

    fun divNumber(a: Double) {
        total /= a
        println("/ $a")
        println("= $total")
    }

    fun resetTotal() {
        total = 0.0
    }
}