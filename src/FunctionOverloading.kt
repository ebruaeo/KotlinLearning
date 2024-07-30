fun main() {
    println(multiply(5))
    println(multiply(8, 9))
    calculatePrice("coffee",4.99)

    val products = mapOf(Pair("cake", 3.99), Pair("can of soda", 1.50))
    calculatePrice(products)

}

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier


fun calculatePrice(name: String, price: Double?) {
    val price = price?.times(1.2)
    println("$name costs $price")
}

fun calculatePrice(products: Map<String, Double>) {
    for (product in products.keys) {
        calculatePrice(product, products[product])
    }


}