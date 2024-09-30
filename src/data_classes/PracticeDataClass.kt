package data_classes

fun main() {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alice", " @gmail", 7))
    customers.add(Customer("John", " @hotmail", 3))
    customers.add(Customer("Carol", " @outlook", 8))
    println(customers)

    val newCustomer = customers[1].copy(email = "johnemail")
    customers.add(newCustomer)
    println(customers)

    sendEmails(customers)
}

fun sendEmails(customers: ArrayList<Customer>){
    customers.forEach { println("Sending an email to ${it.email}") }
}

data class Customer (
    val name : String,
    val email: String,
    val productsBought: Int
)