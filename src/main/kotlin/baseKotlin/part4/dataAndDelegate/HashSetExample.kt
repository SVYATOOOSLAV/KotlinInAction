package baseKotlin.part4.dataAndDelegate

fun main() {
    val precessed = hashSetOf(Client("Alice", 123))
    println(precessed.contains(Client("Alice", 123)))
}
//    """
//        Сравнение значений в HashSet
//        оптимизировано: сначала сравниваются их хэш-коды, и только если они
//        равны, сравниваются фактические значения.
//    """
