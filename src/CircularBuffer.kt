import kotlinx.coroutines.processNextEventInCurrentThread
import kotlin.collections.ArrayDeque

fun main() {
    var circle = CircularBuffer<String>(2)
    circle.write("A")
}

// TODO: implement proper exceptions to complete the task
class EmptyBufferException

class BufferFullException

class CircularBuffer<T>(val length: Int) {

    private val buffer = MutableList<T?>(length) { null }

    private var indexToAdd = 0


    fun read(): T {
        TODO("Implement this function to complete the task")

    }

    fun write(value: T) {
        if (indexToAdd != length) {
            buffer[indexToAdd] = value
            indexToAdd++
        } else {
            indexToAdd = 0
            buffer[indexToAdd] = value
        }
        println(buffer)
    }

    fun overwrite(value: T) {
        TODO("Implement this function to complete the task")
    }

    fun clear() {
        TODO("Implement this function to complete the task")
    }
}