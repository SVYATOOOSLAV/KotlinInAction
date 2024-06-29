package baseKotlin.part5.sub5_2

import baseKotlin.part5.sub5_1.Person

fun main(){
    val people = listOf(Person("Oleg",22), Person("Svyat", 20), Person("Denis", 19))
    // создается словарь с ключами, определяющими признак для группировки
    val peopleMap = people.groupBy { it.age  } // Map <Int, List<Person>>
    println(peopleMap[20])

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))

}