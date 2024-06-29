package baseKotlin.part5.sub5_1

data class Person(val name: String, val age: Int)

fun main(){
    val people = listOf(Person("Oleg",19), Person("Svyat", 20))
    val maxAge = people.maxBy { it.age }
    //or when we use delegate work, we need to use link to the method
    people.maxBy(Person::age)
    println(maxAge)

    val sum = {x: Int, y:Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(1,10))

    // run выполняет переданное ему лямбда-выражение
    run { println(43) }

    // тот же самый поиск старого человека
    println(people.maxBy { p: Person -> p.age })

    var names = people.joinToString(" ", transform = {it.name})
    // если лямбда выражение явялется последним(единственным) аргументом
    names = people.joinToString(" "){it.name}
}