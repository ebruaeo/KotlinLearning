package lambda//! A lambda is an anonymous function (has no name)

fun main() {

    //! how to define lambda
    val myLambda: (String) -> Unit = { name: String -> println("Hello $name") }

    val names = arrayListOf("Alice", "Bob", "Carol")
    val myLambda2: (String) -> Unit = { name: String -> println("Hello there $name") }
    sayHello(names, myLambda2)

    //setOnClickListener(clickListener)
    setOnClickListener({
        // if we are using lambda as a last parameter. We dont have to put it in the paranthesis
        println("Click listener runs")
    })
    setOnClickListener {
        println("Click listener runs")
    }
    sayHello(names) {
        println("Say hello function")
    }

    val numbers = arrayListOf(3, 5, 6, 7, 880, 9, 450)
    println(numbers)
    val newNumbers = update(numbers) { number -> number / 10 }
    println(newNumbers)


    val clientNames = arrayListOf("Ebru", "Ömer", "Esra")
    val messages = getMessages(clientNames) { name -> "Hello $name" }
    println(clientNames)
    println(messages)


}

// Higher order function

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}

fun setOnClickListener(clickListener: () -> Unit) {
    println("Before click listener called")
    clickListener()
    println("After click listener called")
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for (i in 0..numbers.size - 1) {
        if (numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }

    return numbers

}

fun getMessages(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()
    for (client in clients) {
        messages.add(getMessage(client))
    }
    return messages
}