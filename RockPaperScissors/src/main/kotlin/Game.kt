fun main() {
    val optionsParam = arrayOf("Rock", "Paper", "Scissors")
    foo(6)

    val x: Int = 7
    val y: Int = 8
    printSum(x, y)

    val gameChoice = getGameChoice(optionsParam)

    for (x in 15 downTo  1) println(x)

    for (item in optionsParam) {
        println("$item is an item in the array")
    }

    for (index in optionsParam.indices) {
        println("Index $index has item ${optionsParam[index]}")
    }

    for ((index, item) in optionsParam.withIndex()) {
        println("Index $index has item $item")
    }
}

fun foo(param: Int) {
    println("Parameter is $param")
}

fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    println(result)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}


fun maxUnit(a: Int, b: Int): Unit {
    val maxValue = if (a > b) a else b
    println(maxValue)
}

fun max3(a: Int, b: Int) = if (a > b) a else b

//val optionsParam = arrayOf("Rock", "Paper", "Scissors")

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun forIn(i: Int) {
    for (i in 1..10) {
        println(i)
    }
}

//fun getUserChoice(optionsParam: Array<String>): String {
//    print("Please enter one of the following:")
//    for (item in optionsParam) print(" $item")
//    println(".")
//    val userInput = readLine()
//}

