class CustomSet(vararg var numbers: Int) {

    var list = numbers.toMutableList()

    fun  isEmpty(): Boolean {
        return list.isEmpty()
    }

    fun isSubset(other: CustomSet): Boolean {
        if (other.list.containsAll(list)) {
            return true
        } else {
            return false
        }
    }

    fun isDisjoint(other: CustomSet): Boolean {
        if (list.isEmpty() || other.isEmpty()){
            return true
        }
        var isDisjoint = true
        if (!other.isEmpty()){
            for (i in other.list) {
                if (list.contains(i)) {
                    isDisjoint = false
                    break
                }
            }
        }
        return isDisjoint
    }

    fun contains(other: Int): Boolean {
        return list.contains(other)
    }

    fun intersection(other: CustomSet): CustomSet {
        var intersection = CustomSet()
        for (i in list) {
            if (other.contains(i)) {
                intersection.add(i)
            }
        }
        return intersection
    }

    fun add(other: Int) {
        if (!list.contains(other)) {
            list.add(other)
        }

    }

    override fun equals(other: Any?): Boolean {
        var other = other as? CustomSet
        var isEquals = false
        if (list.size == other?.list?.size) {
                if (other.list.containsAll(list)) {
                    isEquals = true
                }
        }
        return isEquals
    }

    operator fun plus(other: CustomSet): CustomSet {
        var plusSet = CustomSet()
        for (i in list) {
            plusSet.add(i)
        }
        for (j in other.list) {
            if (!plusSet.contains(j)) {
                plusSet.add(j)
            }
        }
        return plusSet
    }

    operator fun minus(other: CustomSet): CustomSet {
        var minusList = CustomSet()
        for (i in list) {
            minusList.add(i)
        }
        minusList.list.removeAll(other.list)

        return minusList
    }
}

fun main() {
    var customSet = CustomSet(5, 3, 4, 6)
    var other = CustomSet(2)
    customSet.isEmpty()
    customSet.isSubset(other)
}
