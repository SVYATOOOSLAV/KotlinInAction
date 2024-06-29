package baseKotlin.part3

import baseKotlin.part3.collections.list
import baseKotlin.part3.strings.joinToString
import baseKotlin.part3.strings.lastChar
import baseKotlin.part3.strings.lastChar as last

fun main(){
    println(list.joinToString(separator="; ", prefix="(",postfix=")"))
    println(list.joinToString(" "))
    println("kotlin".last())
    println("kotlin".lastChar)
}