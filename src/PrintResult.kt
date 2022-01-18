import java.util.*

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Определить результат
    if (userChoice == gameChoice) result = "Ничья!"
    else if ((userChoice == "Камень" && gameChoice == "Ножницы") ||
        (userChoice == "Бумага" && gameChoice == "Камень") ||
        (userChoice == "Ножницы" && gameChoice == "Бумага")) result = "Вы выиграли!"
    else result = "Вы проиграли!"
    //Вывести результат
    println("Ваш выбор $userChoice. Я выбрал $gameChoice. $result")
}