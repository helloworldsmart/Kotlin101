data class Recipe(var name: String)

fun main() {
    var mShoppingList = mutableListOf("Tes", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version : $mShoppingList")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is : ${mRecipeMap.getValue("Recipe1")}")
    }

//    test()
//    arrayTest()
//    listTest()
    mutableListTest()
//    mutableListTest2()
//    setTest()
//    mapTest()
//    mMapTest()
}

fun test() {
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five") // 可以
    //  numbers = mutableListOf("six", "seven") // Error
}

fun arrayTest() {

    var array = arrayOf(1, 3, 2)

    var nullArray: Array<String?> = arrayOfNulls(2)

    val size = array.size // 3

    val values = array.reverse() // 2, 3, 1

    val isIn = array.contains(1) // true

    val sum = array.sum() // 6

    val average = array.average() // (1 + 3 + 2) / 3 = 2

    array.min() // 1

    array.max() // 3

    array.sort() // 1, 2, 3

    val myArray = arrayOf(1, 2, 3)
    myArray[0] = 6
    println("myArray[0] is ${myArray[0]}") // myArray[0] is 6
//    myArray.add()

    val myList = mutableListOf(1, 2, 3)
    myList.add(6)
}

fun listTest() {

    val shopping = listOf<String>("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        println(shopping.get(0))
    }

    if (shopping.isNotEmpty()) {
        println(shopping[0])
    }

    for (item in shopping) println(item)

    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }
    // List 跟 Array 差異:  List 是不可變的, 你無法更改他儲存的任何參考

}

fun mutableListTest() {

    val mShopping = mutableListOf<String>("Tea", "Eggs", "Milk")

    // 保留指定的項目, 移除其他的項目
    val toRetain = listOf<String>("Steak", "Eggs")
    mShopping.retainAll(toRetain) // [Eggs]
    println("$mShopping")

    // 加菜囉
//    mShopping.add("Steak") // [Tea, Eggs, Milk, Steak]
//
//    mShopping.add(1, "Fish") // [Tea, Fish, Eggs, Milk, Steak]
//
//    if (mShopping.contains("Milk")) {
//        mShopping.remove("Milk")  // [Tea, Fish, Eggs, Steak]
//    }
//
//    if (mShopping.size > 1) {
//        mShopping.removeAt(1) // [Tea, Eggs, Steak]
//    }
//
//    if (mShopping.size > 0) {
//    //  mShopping.set(0, "Coffee")
//        mShopping[0] = "Coffee"  // [Coffee, Eggs, Steak]
//    }

//    println("-------")
//    println(mShopping)
//    mShopping.sort() // [Coffee, Eggs, Steak]   A-Z
//    println(mShopping)
//    mShopping.reverse() // [Steak, Eggs, Coffee] Z-A
//    println(mShopping)
//    mShopping.shuffle() // [Steak, Eggs, Coffee] 隨機排序
//    println(mShopping)

    // 原本List: [Eggs, Steak, Coffee]

//    val toAdd = listOf<String>("Cookies", "Sugar")
//    mShopping.addAll(toAdd) // [Eggs, Steak, Coffee, Cookies, Sugar]

//    val toRemove = listOf<String>("Milk", "Sugar")
//    mShopping.removeAll(toRemove) // [Eggs, Steak, Coffee, Cookies]



    // 清空
//    mShopping.clear()
//    println(mShopping)

}


fun mutableListTest2() {

    // toList 來製作 List 或 MutableList 的副本，藉由此儲存他的狀態快照
    val mShopping = mutableListOf<String>("A", "C", "B")
    val shoppingCopy = mShopping.toMutableList()
    println(shoppingCopy) // [A, C, B]
    val valuesBySorted = shoppingCopy.sorted()
    println(valuesBySorted) // [A, B, C]
    val valuesByReversed = shoppingCopy.reversed()
    println(valuesByReversed) // [B, C, A]
    val valuesByShuffled = shoppingCopy.shuffled()
    println(valuesByShuffled) // [C, B, A] 隨機

}

fun setTest() {

//    val friendList = listOf("Michael",
//                            "Elon Musk",
//                            "Elon Musk",
//                            "Bill Gates",
//                            "Bill Gates")
//
//    friendList.size // 多出兩個朋友 ?!

    val friendSet = setOf("Michael",
                          "Elon Musk",
                          "Elon Musk",
                          "Bill Gates",
                          "Bill Gates")
    println("friendSet: $friendSet")
    // friendSet: [Michael, Elon Musk, Bill Gates]

    // 川普 Trump
    val isTrumpGoing = friendSet.contains("Trump")
    println(isTrumpGoing) // false

    for (item in friendSet) println(item)

    // Juliet 茱麗葉, Romeo 羅密歐
    val mFriendSet = mutableSetOf<String>("Michael", "Juliet")
    mFriendSet.add("Romeo")
    mFriendSet.remove("Romeo")
    // Harry Potter, Hermione 妙麗
    val toAdd = setOf("Harry Potter", "Hermione")
    mFriendSet.addAll(toAdd) // [Michael, Juliet, Harry Potter, Hermione]
    println(mFriendSet)
    mFriendSet.clear()

    //------


    val friendSetCopy = mFriendSet.toSet()

    val friendList = mFriendSet.toList() // Set -> List

    val mShoppingList = listOf<String>("Tea", "Milk", "Tea", "Milk")
    var shoppingSet = mShoppingList.toSet()  // List -> Set

    if (mShoppingList.size > mShoppingList.toSet().size) {
        println("有重複的值")
    }
    
}

fun mapTest() {

    val r1 = Recipe("雞湯")
    val r2 = Recipe("藜麥沙拉")
    val r3 = Recipe("泰國咖哩")
    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    //  val recipeMap: Map<String, Recipe>
    //  Map<key_type, value_type>

    recipeMap.containsKey("Recipe1")
    val recipeToCheck = Recipe("雞湯")
    if (recipeMap.containsValue(recipeToCheck)) {
        println("煮雞湯不加香菜")
    }


    // 當特定鍵不存在時
    // get: 回傳null
    // getValue: 丟出例外
    if (recipeMap.containsKey("Recipe1")) {
        println("Recipe1 is : ${recipeMap.getValue("Recipe1")}")
    }

    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }

}

fun mMapTest() {

    val r1 = Recipe("雞湯")
    val r2 = Recipe("藜麥沙拉")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)

    val r3 = Recipe("泰國咖哩")
    mRecipeMap.put("Recipe1", r3)

    val r4 = Recipe("什錦飯")
    val r5 = Recipe("香腸捲麵包")
    val recipesToAdd = mapOf("Recipe1" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)

    mRecipeMap.remove("Recipe2")

    val recipeToRemove = Recipe("藜麥沙拉")
    mRecipeMap.remove("Recipe2", recipeToRemove)

    mRecipeMap.clear()

    val recipeMapCopy = mRecipeMap.toMap()
    // mRecipeMap.toMutableMap()
    //   mRecipeMap.toMutableList() // Cannot find declaration to go to
    mRecipeMap.toList()

    // entries 屬性來取得鍵/值
    val recipeEntries = mRecipeMap.entries

    if (mRecipeMap.size > mRecipeMap.values.toSet().size) {
        println("mRecipeMap contains duplicates values")
    }

    mRecipeMap.values.toSet()

}