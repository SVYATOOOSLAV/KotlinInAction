package baseKotlin.part2

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() = height == width

}

fun main(){
    val test = Rectangle(5,5)
    println(test.isSquare)
}