class Song(val title: String, val artist: String) {

    //Если при создании каждого объекта должен выполняться дополнительный
    //код, можно использовать один или несколько блоков инициализации. Блоки инициализации
    //выполняются при инициализации объекта сразу же после вызова конструктора и снабжаются префиксом init.
    init {
        println("Song $title has been created.")
    }

    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }

    //Второй блок инициализации выполняется после создания свойств.
    init {
        println("Экземпляр класса Song $title создан!")
    }

}

fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}
