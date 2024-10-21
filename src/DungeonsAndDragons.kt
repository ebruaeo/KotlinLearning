import kotlin.random.Random

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = modifier(constitution) + 10

    companion object {

        fun ability(): Int {
            val diceNumbers = mutableListOf<Int>()
            for (i in 1..4) {
                val dice = Random.nextInt(1, 7)
                diceNumbers.add(dice)
            }
            return diceNumbers.sum() - diceNumbers.min()
        }

        fun modifier(score: Int): Int {
            var modifier = (score - 10).floorDiv(2)
            return modifier
        }
    }
}



