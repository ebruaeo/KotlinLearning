import kotlin.random.Random

val words = listOf(
    "Merhaba",
    "Elma",
    "Kitap",
    "Kalem",
    "Masa",
    "Kedi",
    "Köpek",
    "İnsan",
    "Aşk",
    "Güneş",
    "Ay",
    "Su",
    "Yemek",
    "Okul",
    "Rüzgar",
    "Deniz",
    "Ev",
    "Çiçek",
    "Bahçe",
    "Arkadaş"
)
var word = ""
var guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0


fun main(args: Array<String>) {
    setUpGame()
}

fun setUpGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()
    println(word)

    for (i in word.indices)
        guesses.add('_')


    var gameover = false
    do {
        printGameStatus()
        println("Please enter a letter:")
        val input = readLine() ?: ""
        if (input.isEmpty()) {
            println("Thats not a valid input. please try again")
        } else {
            val letter = input[0].uppercaseChar()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                        guesses[i] = letter
                }
                if (!guesses.contains('_'))
                    gameover = true
            } else {
                println("Sorry")
                remainingGuesses--
                mistakes++
                if (mistakes == 6)
                    gameover = true
            }
        }
    } while (!gameover)

    if (mistakes == 6) {
        printGameStatus()
        println("Sorry you lost. The word was $word")
    } else {
        println("Congratulation. You win!")
        println("The word was $word")
    }

}

fun printGameStatus() {
    when (mistakes) {
        0 -> print0Mistake()
        1 -> print1mistake()
        2 -> print2mistake()
        3 -> print3mistake()
        4 -> print4mistake()
        5 -> print5mistake()
        6 -> print6mistake()
    }

    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}

fun print0Mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6mistake() {
    println("  |------|-")
    println("  |      |-")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}