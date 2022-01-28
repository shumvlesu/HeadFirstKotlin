import java.util.*

class Dog(
     val name: String,
     weight_param: Int,
     breed_param: String
 ) {

     init {
         print("Dog $name has been created. ")
     }

     var activities = arrayOf("Walks")
     private val breed = breed_param.uppercase(Locale.getDefault())

     init {
         println("The breed is $breed.")
     }

    //Для обновления свойства weight set-метод использует идентификатор
    //field, обозначающий поле данных для свойства. Его можно рассматривать как ссылку на нижележащее значение свойства. Очень важно
    //использовать field в get- и set-методах вместо имени свойства, потому
    //что так вы предотвращаете зацикливание. Например, при выполнении
    //следующего кода set-метода система попытается обновить свойство
    //weight, из-за чего set-метод будет вызван снова... и снова... и снова
     var weight = weight_param
         set(value) {
             if (value > 0) field = value
         }

    //Get-метод. Он представляет собой функцию без параметров с именем get, которая добавляется в свойство. Чтобы включить его в свойство,
    //следует записать его сразу же под объявлением свойства
     val weightInKgs: Double
         get() = weight / 2.2

     fun bark() {
         println(if (weight < 20) "Yip!" else "Woof!")
     }

 }


fun main() {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(Dog("Kellie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}

//*  С помощью классов вы можете определять собственные типы.

//*  Класс представляет собой шаблон для создания объектов. На основе одного класса можно создать много объектов.

//*  То, что объект знает о себе, — свойства. То, что объект может сделать, — функции.

//*  Свойство представляет собой переменную, локальную по отношению к классу.

//*  Класс определяется ключевым словом class.

//*  Оператор «точка» используется для обращения к свойствам и функциям объекта.

//*  Конструктор выполняется при инициализации объекта.

//*  Свойство можно определить в первичном конструкторе с префиксом val или var.
//Свойство также можно определить вне конструктора: для этого оно добавляется в тело класса.

//*  Блоки инициализации выполняются при инициализации объекта.

//*  Каждое свойство должно быть инициализировано перед использованием его значения.

//*  Get- и set-методы предназначены для чтения и записи значений свойств.

//*  За кулисами компилятор генерирует для каждого свойства get- и set-метод по умолчанию.