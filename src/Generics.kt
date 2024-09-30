fun main() {

    val myBox = Box<String>()
    myBox.display("Contents")


    val carBox = Box<Car>()
    carBox.display(Car())

    val newBox = NewBox<Int, Float>()
    newBox.display(12, 34F)

}


class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class Car {

}

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}