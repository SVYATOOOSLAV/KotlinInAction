package baseKotlin.part4

class Outer {
    inner class Inner{ //Вложенный класс
        fun getOuterRef(): Outer = this@Outer
    }
}