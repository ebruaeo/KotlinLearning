package standardFunction.with

fun main() {
with(Store()){
    shoes = 10
    shirts = 35
    jackets = 43
    printInventory()
}
}

class Store {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory (){
        println("We have $shoes shoes, $shirts shirts and $jackets jackets.")
    }
}