package baseKotlin.test

import Hello
import baseKotlin.test.inherit.Person
import baseKotlin.test.inherit.Student

fun main(){
    Hello("12")
    val person: Person = Student()
    person.action()
}