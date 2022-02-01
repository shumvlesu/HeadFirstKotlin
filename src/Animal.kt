//Супер класс, от которого все будут наследоваться
open class Animal {

    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }
    open fun eat() {
        println("The Animal is eating")
    }
    open fun roam() {
        println("The Animal is roaming")
    }
    fun sleep() {
        println("The Animal is sleeping")
    }

}