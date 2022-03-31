fun main(args: Array<String>) {

    data class Recipe(var name: String)


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
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
    //mRecipeMap original: {Recipe1=Recipe(name=Chicken Soup), Recipe2=Recipe(name=Quinoa Salad), Recipe3=Recipe(name=Thai Curry)}
    //mRecipeMap updated: {Recipe1=Recipe(name=Chicken Soup), Recipe2=Recipe(name=Quinoa Salad), Recipe3=Recipe(name=Thai Curry), Recipe4=Recipe(name=Jambalaya), Recipe5=Recipe(name=Sausage Rolls)}
    //Recipe1 is: Recipe(name=Chicken Soup)


    //*  Массив, инициализированный значениями null, создается функцией arrayOfNulls.

    //*  Полезные функции массивов: sort, reverse, contains, min, max, sum, average.

    //*  Стандартная библиотека Kotlin содержит готовые классы и функции, объединенные в пакеты.

    //*  Список List — коллекция, отслеживающая позицию (индекс) элементов; может содержать повторяющиеся значения.

    //*  Множество Set — неупорядоченная коллекция, в которой не может быть дубликатов.

    //*  Ассоциативный массив Map — коллекция пар «ключ-значение»; может содержать дубликаты значений, но не дубликаты ключей.

    //*  Коллекции List, Set и Map являются неизменяемыми. MutableList, MutableSet и MutableMap — изменяемые разновидности этих коллекций.

    //*  Списки List создаются функцией listOf.

    //*  Списки MutableList создаются функцией mutableListOf.

    //*  Множества Set создаются функцией setOf.

    //*  Множества MutableSet создаются функцией mutableSetOf.

    //*  Чтобы проверить наличие дубликатов, множество Set сначала проверяет совпадающие значения хеш-кодов, а затем
    //использует операторы === и == для проверки ссылочного и объектного равенства.

    //*  Map создаются функцией mapOf, которой передаются пары «ключ-значение».

    //*  MutableMap создаются функцией mutableMapOf.

}