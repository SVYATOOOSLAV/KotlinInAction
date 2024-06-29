package baseKotlin.part3.collections

fun sum(vararg nums: Int): Int {
    var total = 0
    for (num in nums) {
        total += num
    }
    return total
}

fun main(){
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    //* перед массивом numbers "разворачивает" его, то есть извлекает его элементы (1, 2, 3, 4, 5) и передает их функции sum() как отдельные аргументы.
    val result = sum(*numbers)

    println(result)
}

