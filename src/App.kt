fun main(args: Array<String>) {
    var w: Wolf? = Wolf()
    if (w != null) {
        w.eat()
    }
    var x = w?.hunger
    println("The value of x is $x")
    //Использует «Элвис-оператор»
    //для присваивания y значения hunger,
    //если переменная w не равна null.
    //Если переменная w равна null,
    //то y присваивается -1.
    var y = w?.hunger ?: -1
    println("The value of y is $y")
    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")
    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let { println(it) } //Выводит элементы массива, отличные от null.
    }
    getAlphaWolf()?.let { it.eat() }
    w = null
    //Выдает исключение NullPointerException, так как значение w равно null.
    //var z = w!!.hunger


    //Результат:
    //The Wolf is eating meat
    //The value of x is 10
    //The value of y is 10
    //The value of myWolf?.wolf?.hunger is 8
    //Hi
    //Hello
    //The Wolf is eating meat
}
