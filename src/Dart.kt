object Darts {

    fun score(x: Double, y: Double): Int {
        var distance = Math.sqrt(x * x + y * y)
        if (distance <= 1) {
            return 10
        } else if (distance <= 5) {
            return 5
        } else if (distance <= 10) {
            return 1
        } else {
            return 0
        }
    }

    fun score (x: Int, y: Int): Int{
       return score(x.toDouble(),y.toDouble())
    }
  fun score (x: Double, y: Int): Int{
       return score(x.toDouble(),y.toDouble())
    }
  fun score (x: Int, y: Double): Int{
       return score(x.toDouble(),y.toDouble())
    }


}

fun main() {
    Darts.score(-9,9)
}