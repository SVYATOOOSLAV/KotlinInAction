package baseKotlin.part5.sub5_2

data class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    // it.toList() преобразует строку в список символов
    println(strings.map { it.toList() })
    println(strings.flatMap { it.toList() })

    val books = listOf(
        Book(
            "Thursday Next", listOf("Jasper Forde")
        ),
        Book(
            "Mort", listOf("Terry Pratchett")
        ),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println(books.flatMap { it.authors }.toSet())

    // flatmap необходим чтоб  объединить коллекцию коллекций элементов
}