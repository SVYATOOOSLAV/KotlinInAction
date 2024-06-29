package baseKotlin.part5.sub5_2

import baseKotlin.part5.sub5_1.Person

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Oleg", 22), Person("Svyat", 20))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))

}
