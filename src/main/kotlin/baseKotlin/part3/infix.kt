package baseKotlin.part3

// extension with infix
infix fun <T, K> T.to(other: K) = Pair(this, other)
//infix fun Any.to(other : Any) = Pair(this , other)

val map1 = mapOf(Pair(1, 1))
val map2 = mapOf(1 to 1)
val map3 = mapOf("1" to "1")
val map4 = mapOf(1 to "1")

fun main() {
    // мультидекларация
    val (number, name) = 1 to "one"
    println(map3)
    println(number)
    println(name)
}
