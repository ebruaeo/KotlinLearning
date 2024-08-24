package polymorphism

fun main() {
val mom = Mom()
    val daughter = Daughter()

    mom.say("Hi")
    daughter.say("Hi")
}

open class Mom {
    open fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter : Mom() {
    override fun say(message: String) {
        println("Daughter says $message")
    }
}
