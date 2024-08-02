fun main() {
    val name = "Ebru"
    println(name.slim())
}

 //normal function
fun slim(name:String){

}
fun String.slim() = this.substring(1, length - 1)

fun String.slim2(): String {
    return this.substring(1, length - 1)
}

