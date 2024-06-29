package baseKotlin.part4

import java.io.Serializable

interface State : Serializable

class ButtonStatic {
    fun getterCurrentState() : State = ButtonState()

    class ButtonState : State{ // Вложенный статический класс
        override fun toString(): String {
            return "ButtonState()"
        }
    }
}

fun main(){
   val buttonStatic = ButtonStatic()
    println(buttonStatic.getterCurrentState())
}