class Squares(var size: Int) {

    var list = 1..size

    fun sumOfSquares(): Int {
        var sumOfSquares = 0
        for (i in list) {
            sumOfSquares += i * i
        }
        return sumOfSquares
    }

    fun squareOfSum():Int {
        var sum = 0
        for (i in list) {
            sum += i
        }
        val squareOfSum = sum * sum
        return squareOfSum
    }

    fun difference(): Int {
        var difference = squareOfSum() - sumOfSquares()
        return difference
    }
}

fun main() {
    var square = Squares(10)
    println(square.difference())
}