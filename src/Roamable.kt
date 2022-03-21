interface Roamable {
    //При добавлении абстрактной функции в интерфейс не нужно ставить перед именем функции префикс abstract,
    //как это следовало бы сделать при добавлении абстрактной функции в абстрактный класс.
    //В случае с интерфейсом компилятор автоматически определяет, что функция без тела должна
    //быть абстрактной, поэтому ее не нужно определять как абстрактную.
    fun roam()
}