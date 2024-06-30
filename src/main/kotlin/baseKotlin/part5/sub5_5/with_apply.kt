package baseKotlin.part5.sub5_5

import java.lang.StringBuilder

fun main() {
    // with - получения резульатат лямбда выражения
    println(alphabetWith())

    // apply - получение объекта получателя, обычно необходим для первоначальной настройки объекта
    println(alphabetApply())

    println(alphabetBuildString())
}

// аналогия функции расширения
fun alphabetWith() = with(StringBuilder()) {
    ('A'..'Z').forEach {
        this.append(it)
    }
    append("\nNow I know alphabet!")
    this.toString()
}

fun alphabetApply() = StringBuilder().apply {
    ('A'..'Z').forEach {
        this.append(it)
    }
    append("\nNow I know alphabet!")
}.toString()

// buildString - создает экзмепляр StringBuilder и вызывает метод toString()
fun alphabetBuildString() = buildString {
    ('A'..'Z').forEach {
       append(it)
    }
    append("\nNow I know alphabet!")
}