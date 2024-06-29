package baseKotlin.part3.strings

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    // тоже мультидекларация
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// extension fun, it doesn't override in subclass
fun String.lastChar(): Char = this[this.length - 1]

val String.lastChar: Char
    get() = get(this.length - 1)