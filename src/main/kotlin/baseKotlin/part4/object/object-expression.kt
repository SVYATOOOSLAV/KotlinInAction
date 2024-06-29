package baseKotlin.part4.`object`

fun main() {
    // val anonymous = Comparator<Person> { o1, o2 -> o1.name.compareTo(o2.name) }

    // анононимный объект способен реализовывать несколько интерфейсов
    // каждый новый вызов анонимного объека порождает новый объект
    val anonymous = object : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.name.compareTo(o2.name)
        }
    }

    val persons = listOf(Person("qwerty"), Person("name"))
    persons.sortedWith(anonymous)
    println(persons)
}