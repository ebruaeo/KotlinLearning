fun main() {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception){
        e.printStackTrace()
        println("Exception occurs \n${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}