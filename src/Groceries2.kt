fun main() {

    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    //Фильтр по категории
    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")
    //vegetables: [Grocery(name=Tomatoes, category=Vegetable, unit=lb, unitPrice=3.0, quantity=3), Grocery(name=Mushrooms, category=Vegetable, unit=lb, unitPrice=4.0, quantity=1)]

    //
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")
    ////notFrozen: [Grocery(name=Tomatoes, category=Vegetable, unit=lb, unitPrice=3.0, quantity=3), Grocery(name=Mushrooms, category=Vegetable, unit=lb, unitPrice=4.0, quantity=1), Grocery(name=Bagels, category=Bakery, unit=Pack, unitPrice=1.5, quantity=2), Grocery(name=Olive oil, category=Pantry, unit=Bottle, unitPrice=6.0, quantity=1)]

    //Функция map берет элементы коллекции и преобразует каждый из них по заданной вами формуле. Результат преобразования возвращается в виде нового списка List.
    //map возвращает как не странно List
    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")
    //groceryNames: [Tomatoes, Mushrooms, Bagels, Olive oil, Ice cream]

    //увеличим каждый элемент на 0.5
    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitPrice: $halfUnitPrice")
    //halfUnitPrice: [1.5, 2.0, 0.75, 3.0, 1.5]

    //Цепочка вызовов filter а потом map
    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("newPrices: $newPrices")
    //newPrices: [8.0, 12.0]

    //forEach - функция высшего порядка, аналог for. Но в отличие от for возвращает значение и может использоваться в цепочке вызовов.
    println("Grocery names: ")
    groceries.forEach {println(it.name)}
    //Grocery names:
        //Tomatoes
        //Mushrooms
        //Bagels
        //Olive oil
        //Ice cream


    println("Groceries with unitPrice > 3.0: ")
    //Groceries with unitPrice > 3.0:

    //фильтр отбирающий продукты с прайсом больше 3. потом выводим их названия.
    groceries.filter { it.unitPrice > 3.0 }.forEach{println(it.name)}
    //Mushrooms
    //Olive oil

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("itemNames: $itemNames")
    //itemNames: Tomatoes Mushrooms Bagels Olive oil Ice cream

}