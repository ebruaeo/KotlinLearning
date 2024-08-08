package inheritance

fun main() {
    val engineer = Engineer()
    engineer.name = "Engineer"
    engineer.salary = 70000
    engineer.revenue = 10000
    engineer.work()
    engineer.study()

    val doctor = Doctor()
    doctor.name = "Doctor"
    doctor.salary = 150000
    doctor.revenue = 100000
    doctor.work()
    doctor.study()

}

open class Job {
    var name = "Job"
    var revenue = 10000
    var salary = 10000

    fun work() {
        revenue += salary
        println("$name has $revenue revenue")

    }

    fun study() {
        salary += 1000
        println("$name has $salary salary")

    }
}

class Engineer : Job() {

}

class Doctor : Job() {

}