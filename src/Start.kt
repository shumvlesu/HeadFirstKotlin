fun main() {

    //Создание 2х объектов Cat и одного Fish.
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")


    //Создаем несколько объектов Vet.
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()
    //Объекты Vet работают со своими разновидностями Pet.
    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)


    //Создание объекта Contest, предназначенного только для Cat.
    val catContest = Contest<Cat>(catVet) //Vet<Cat> связывается с Contest<Cat>.
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    //Создание объекта Contest для Pet;
    //такой объект будет принимать любые подклассы Pet.
    val petContest = Contest<Pet>(petVet) //Vet<Pet> связывается с Contest<Pet>
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    //Vet<Pet> связывается с Contest<Fish>.
    val fishContest = Contest<Fish>(petVet)

    //Создание объектов Retailer.
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()


    //*  Обобщения позволяют писать универсальный безопасный по отношению к типам код.
    // Коллекции (такие, как MutableList) используют обобщения.

    //*  Обобщенный тип определяется в угловых скобках <>:  class Contest<T>

    //*  Обобщенный тип ограничивается указанным супертипом: class Contest<T: Pet>

    //*  При создании экземпляра класса с обобщенным типом «реальный» тип указывается в угловых
    //скобках: Contest<Cat>

    //*  Компилятор старается вычислить обобщенный тип, если это возможно.

    //*  Вы можете определить функцию, использующую обобщенный тип, за пределами объявления класса или функцию с другим обобщенным
    //типом:
    //  fun <T> listPet(): List<T>{
    //      ...
    // }

    //*  Обобщенный тип называется инвариантным, если он принимает ссылки только этого конкретного типа.
    // Обобщенные типы инвариантны по умолчанию.

    //*  Обобщенный тип называется ковариантным, если вы можете использовать подтип вместо супертипа.
    // Чтобы указать, что тип является ковариантным, поставьте перед ним префикс out.

    //*  Обобщенный тип называется контрвариантным, если вы можете использовать супертип вместо подтипа.
    // Чтобы указать, что тип является контрвариантным, поставьте перед ним префикс in.

}
