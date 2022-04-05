fun main(args: Array<String>) {

    //один входной параметр. { x: Int -> x + 5 } можно заменить на более компактный вид - {it+5}
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    //передаем 2 входящих параметра в лямбду
    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7) //invoke - это явный вызов выполнения лямбда выражения. можно проще - addInts(6, 7)
    println("Pass 6, 7 to addInts: $result")

    //(Int, Int) -> Int - 2 входных параметра и один выходной (возвращаемый)
    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    //(Int) -> Int - указаны типы входного и выходного значения
    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    //Unit = - означает что лямбда не имеет возвращаемого значения (ничего не возвращает)
    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

}