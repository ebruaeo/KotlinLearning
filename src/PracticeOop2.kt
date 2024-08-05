fun main() {
    val math = Math()
    println("3 + 7 = ${math.add(3, 7)}")
    println("7 * 5 = ${math.mul(7, 5)}")
    println("2 - 8 = ${math.sub(2, 8)}")
    println("7 / 2 = ${math.div(7, 2)}")

}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b


}