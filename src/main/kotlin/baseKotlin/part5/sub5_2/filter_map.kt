package baseKotlin.part5.sub5_2

import baseKotlin.part5.sub5_1.Person

fun main(){
    val people = listOf(Person("Oleg",22), Person("Svyat", 20))
    println(people.filter{it.age > 21} )

    val numbers = listOf(1,2,3,4)
    // создается новая коллекция, старая не изменяется
    val newNumbers = numbers.map {it * it}
    println(newNumbers)

    println(people.map(Person::name))

    people.filter { p:Person -> p.age > 20 }.map(Person::name).forEach { println(it) }

    val maxAge = people.maxBy(Person::age).age
    people.filter { it.age == maxAge }.forEach { println(it) }

    val numbersMap = mapOf(0 to "zero", 1 to "one")
    println(numbersMap.mapValues { it.value.uppercase()})
}