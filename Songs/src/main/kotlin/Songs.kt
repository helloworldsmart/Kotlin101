class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
       println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}
class Dog(val name: String, var weight: Int, breed_param: String) {

    init {
        println("Dog $name has been created.")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    lateinit var temperament: String

    init {
        println("The breed is $breed.")
    }
}