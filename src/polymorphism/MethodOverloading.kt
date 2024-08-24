package polymorphism

fun main() {
    val mom = MyMom()

    mom.say("Hi")
    mom.say()
    mom.say(4)
    mom.say("Hello daughter",2)

}

open class MyMom {
    fun say(message: String) {
        println("Mom says $message")
    }

    fun say(times: Int) {
        for (i in 1..times) {
            println("Mom says Hello")
        }
    }

    fun say() {
        println("Mom says how are you?")
    }

    fun say(message: String, times: Int) {
        for (i in 1..times) {
            println("Mom says $message")
        }
    }
}

