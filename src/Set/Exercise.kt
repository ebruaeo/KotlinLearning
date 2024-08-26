package Set

fun main() {
    val customers = hashSetOf("Ömer", "Esra", "Ebru", "Mert")
    customers.add("Hande")
    println(customers)
    customers.remove("Mert")
    println(customers)
}