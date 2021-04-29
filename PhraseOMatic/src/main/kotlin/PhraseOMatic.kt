fun main() {
    val wordArray1 = arrayOf("24/7", "muliti-tier", "B-to-B")

    val arraySize1 = wordArray1.size

    val rand1 = (Math.random() * arraySize1).toInt()

    val phrase = "${wordArray1[rand1]}"

    println(phrase)
}