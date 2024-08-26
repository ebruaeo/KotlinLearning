package Map

fun main() {
    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept", 2345)

    var total = attendance.getValue("25 Sept") + attendance.getValue("26 Sept")
    println(total)

    println(attendance.containsKey("22 Sept"))
}