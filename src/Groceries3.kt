fun main() {

    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    //Группировка
    //группируем по категории, получая при этом map. у которой ключ это категория, а значение это List с отобранными продуктами.
    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }
    //Vegetable
    //    Tomatoes
    //    Mushrooms
    //Bakery
    //    Bagels
    //Pantry
    //    Olive oil
    //Frozen
    //    Ice cream


    //fold
    //С функцией fold вы можете задать исходное значение и выполнить некоторую операцию для каждого элемента коллекции.
    // Например, с ее помощью можно перемножить все элементы List<Int> и вернуть результат или же выполнить конкатенацию значений name всех
    //элементов из List<Grocery>
    //здесь мы суммируем все элементы ints. Без цикла, одной строкой, мы перебрали все элементы List.
    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")
    //sumOfInts: 6

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")
    //productOfInts: 6

    //Конкатенируем в одну строку все названия
    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")
    //names:  Tomatoes Mushrooms Bagels Olive oil Ice cream

    //Узнаем какой остаток после покупок останется от 50р.
    val changeFrom50 = groceries.fold(50.0) { change, item ->
        change - item.unitPrice * item.quantity
    }
    println("changeFrom50: $changeFrom50")
    //changeFrom50: 22.0

}