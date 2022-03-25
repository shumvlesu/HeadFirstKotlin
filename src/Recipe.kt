data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy")


class Mushroom(val size: Int, val isMagic: Boolean) {
    //Вторичный конструктор, обязательно должен передовать хоть что то в первичный.
    //size у нас во вторичном нет, тогда просто передадим в первичный 0.
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        //Код, выполняемый при вызове вторичного конструктора
    }
}

//Пример функции, использующей значения параметров по умолчанию.
fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
    //Код поиска рецептов
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}


//Пример перегруженных функций.
fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}
//--