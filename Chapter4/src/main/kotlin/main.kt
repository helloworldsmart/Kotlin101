fun main() {
    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog.name)
    myDog.weight = 75
    myDog.bark()

    var dogs = arrayOf(Dog("Fido", 70, "Mixed"),
                       Dog("Ripper", 10, "Poodle"))

    dogs[1].weight = 15
    dogs[1].bark()
}

class Dog(val name: String, var weight: Int, val breed: String) {
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}