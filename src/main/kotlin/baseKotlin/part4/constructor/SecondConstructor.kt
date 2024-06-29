package baseKotlin.part4.constructor

open class View{
    constructor(text: String)
    constructor(text: String, label: String)
}

class MyButton: View {
    constructor(text: String) : this(text, "Название") // переадресация внутри класса на второй другой конструктор
    constructor(text: String, label: String) : super(text, label) // отправляем текст в базовый класс
}