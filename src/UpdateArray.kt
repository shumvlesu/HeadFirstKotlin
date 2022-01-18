//при передаче значения функции в действительности
//передается ссылка на объект. Означает ли это, что в объект можно вносить изменения?

//Ответ: Да. Пример ниже

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    updateArray(options)
    println(options[2])
}

fun updateArray(optionsParam: Array<String>) {
    optionsParam[2] = "Fred"
}

//Циклы
fun getUserChoice(optionsParam: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Введите один из перечисленного:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput.lowercase() in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("Вы должны выбрать из предложенных значений.")
    }
    return userChoice


    //ТЕОРИЯ:

    // x += 2 делает то же самое, что и команда: x = x + 2

    //Например, следующий код выводит числа от 1 до 99 и исключает значение 100: for (x in 1 until 100) println(x) из за слова - until

    //следующий код выводит числа от 15 до 1 в обратном порядке: for (x in 15 downTo 1) println(x)

    //следующий код выводит нечетные числа в диапазоне от 1 до 100: for (x in 1..100 step 2) println(x)

    //Перебирает все элементы массива
    //с именем optionsParam.
    //for (item in optionsParam) {
    //    println("$item is an item in the array")
    //}

    //перебор по индексам массива кодом следующего вида:
    //for (index in optionsParam.indices) {
    //    println("Index $index has item ${optionsParam[index]}")
    //}

    //можно даже немного упростить, возвращая индекс массива и значение как часть цикла:
    //for ((index, item) in optionsParam.withIndex()) {
    //    println("Index $index has item $item")
    //}


}