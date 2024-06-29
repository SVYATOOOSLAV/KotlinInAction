package baseKotlin.part4


open class Button: Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff() // Определение родителя
        super<Focusable>.showOff()
    }
}

// при наследовании констуктор базовго класса необходимо прописать
private class RadioButton(var label: String): Button()

class Secret private constructor(){}

fun main(){
    val button = Button()
    button.showOff()
    button.setFocus()
    button.click()
}