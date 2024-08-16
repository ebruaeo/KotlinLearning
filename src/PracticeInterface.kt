fun main() {
    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("Your Local restaurant provides food")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("Delicious")
    }

    override fun provideBill() {
        println("Please pay 200")
    }

}