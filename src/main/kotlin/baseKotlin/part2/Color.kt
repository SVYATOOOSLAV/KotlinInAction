package baseKotlin.part2

enum class Color(
    val r: Int, val g: Int, val b: Int
) {

    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIG0(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

}

enum class ColorWord(
    var nameColor: String
) {
    RED("Красный"), ORANGE("Оранжевый"),
    YELLOW("Желтый"), GREEN("Зеленый"), BLUE("Голубой"),
    INDIG0("Синий"), VIOLET("Фиолетовый")
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Каждый"
        Color.ORANGE -> "Охотник"
        Color.YELLOW -> "Желает"
        Color.GREEN -> "Знать"
        Color.BLUE -> "Где"
        Color.INDIG0 -> "Сидит"
        Color.VIOLET -> "Фазан"
    }
fun mixColor(c1: Color, c2: Color) =
    when (setOf(c1,c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIG0
        else -> "не удалось смешать"
    }
fun mixColorOptim(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                (c1 == Color.BLUE && c2 == Color.YELLOW)  -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE)  -> Color.INDIG0
        else -> "не удалось смешать"
    }
fun main() {
    println(Color.BLUE.rgb())
    println(ColorWord.RED.nameColor)
    println(getMnemonic(Color.BLUE))
    println(mixColor(Color.RED, Color.YELLOW))
    println(mixColor(Color.YELLOW, Color.RED))
    println(mixColorOptim(Color.YELLOW, Color.RED))
}