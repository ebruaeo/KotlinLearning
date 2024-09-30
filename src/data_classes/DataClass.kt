package data_classes

fun main() {
    val myUser = User("Ebru", "@gmail", "12345")
    println(myUser)

    val myUser2 = User("Ebru", "@gmail", "12345")
    println(myUser2)

    println(myUser == myUser2)

    val myUser3 = myUser2.copy(email = "ebruaeo@hotmail")
    println(myUser3)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)


