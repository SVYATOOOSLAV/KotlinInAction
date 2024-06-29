package baseKotlin.part4

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable{
    fun setFocus() = println("set focus")
    fun showOff() = println("I'm focusable")
}