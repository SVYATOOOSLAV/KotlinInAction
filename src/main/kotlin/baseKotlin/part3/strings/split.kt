package baseKotlin.part3.strings

fun main(){
    println("12.345-6.A".split("[.-]".toRegex()))
    println("12.345-6.A".split(".","-"))
    println("wefew/wefwe/wfe/efe.efe".substringAfterLast("/"))
}