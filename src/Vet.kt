//ветеринар может лечить только животных поэтому ограничим обобщение классом Pet
//Префикс in в классе Vet означает, что Vet<Pet> может использоваться вместо Vet<Cat>, поэтому код успешно компилируется.
//например - val catContest = Contest<Cat>(Vet<Pet>())
//class Vet<in T: Pet> {
//перенес in в свойство класса Contest
class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}