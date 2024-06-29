package baseKotlin.part2

import java.util.TreeMap

fun main() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    for (el in binaryReps) {
        println("${el.key} = ${el.value}")
    }

    val list = arrayListOf("10", "11", "100")
    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }

}