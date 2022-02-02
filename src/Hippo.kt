class Hippo : Animal() { //Это означает «класс Hippo является подтипом Animal».

    override val image: String = "hippo.jpg"
    override val food: String = "grass"
    override val habitat: String = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

//    override fun roam() {
//
//    }

}