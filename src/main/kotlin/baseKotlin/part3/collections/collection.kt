package baseKotlin.part3.collections

val set = hashSetOf(1, 7, 53)
var list = arrayListOf(1, 7, 53)
var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}
