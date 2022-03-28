class MyWolf {
    var wolf: Wolf? = Wolf()
    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf() : Wolf? {
    return Wolf()
}