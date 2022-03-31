fun main(args: Array<String>) {

    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
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

    //mShoppingList original: [Tea, Eggs, Milk]
    //mShoppingList items added: [Tea, Eggs, Milk, Cookies, Sugar, Eggs]
    //mShoppingList sorted: [Coffee, Cookies, Eggs, Eggs, Milk, Sugar]
    //mShoppingList reversed: [Sugar, Milk, Eggs, Eggs, Cookies, Coffee]



    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    //mShoppingSet: [Sugar, Milk, Eggs, Cookies, Coffee]
    //mShoppingSet items added: [Sugar, Milk, Eggs, Cookies, Coffee, Chives, Spinach]
    //mShoppingList new version: [Sugar, Milk, Eggs, Cookies, Coffee, Chives, Spinach]

}