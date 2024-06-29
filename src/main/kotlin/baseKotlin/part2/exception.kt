package baseKotlin.part2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import java.nio.Buffer

fun main(){
    val number = 100
    val percentage =
        if (number in 1..100)
            number
        else
            throw IllegalArgumentException("Incorrect number")
    //println(percentage)

    readNumber(BufferedReader(StringReader("Svyat")))
}

fun readNumber(reader: BufferedReader){
    val number = try{
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException){
        null
    }
    println(number)
}