fun main() {
    val info = Info<String>()
    info.getlength("ebru")

    val info2 = Info<Double>()
    info2.getlength(23.4678)

    val info3 = Info<ArrayList<Int>>()
    info3.getlength(arrayListOf(3, 5, 7, 80, 4, 2))
}

class Info<T> {
    fun getlength(item: T) {
        println(item.toString().length)
    }
}