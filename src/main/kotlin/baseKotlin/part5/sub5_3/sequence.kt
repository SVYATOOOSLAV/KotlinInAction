package baseKotlin.part5.sub5_3

import baseKotlin.part5.sub5_1.Person

fun main() {
    // последовательности не создают промежуточных коллекций
    val people = listOf(Person("Oleg", 22), Person("Svyat", 20))

    // на каждом этапе создается коллекция, filter и map возвращают список
    println(people.map(Person::name).filter { it.startsWith("S") })

    // повышаем производительность с помощью последовательности
    println(people.asSequence().map(Person::name).filter { it.startsWith("S") }.toList())
    // последовательности не могут найти элемент по индексу

    differentBetweenCollectionAndSequence()

    // Отложенные вычисления позволяют пропустить обработку некоторых элементов
    println((1..4).asSequence().map { it * it }.find { it > 3 })

    // Отложенное выполнение операций (пока не будет вызван sum)
    println(generateSequence (0) { it + 1 }.takeWhile { it <= 100 }.sum())
}

private fun differentBetweenCollectionAndSequence() {
    // Все промежуточные операции ожидают вызова завершающей (терминальной) операции.
    // Выполнение промежуточных операций всегда откладывается

    // Такая работа происходит именно с последовательностями.
    // У коллекций сначала будет map для всех элементов, потом filter
    print("Sequence: ")
    (1..4).asSequence()
        .map {
            print("map($it) ")
            it * it
        }
        .filter {
            print("filter($it) ")
            it % 2 == 0
        }
        .toList()

    println()
    print("Collection: ")

    (1..4)
        .map {
            print("map($it) ")
            it * it
        }
        .filter {
            print("filter($it) ")
            it % 2 == 0
        }
    println()
}