package baseKotlin.part2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Mul(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalWithoutReturn(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        evalWithoutReturn(e.right) + evalWithoutReturn(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalWhen(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evalWhen(e.right) + evalWhen(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }
fun evalWhenWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum ->{
            val left = evalWhenWithLogging(e.left)
            val right = evalWhenWithLogging(e.right)
            println("sum $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithoutReturn(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWhenWithLogging((Sum(Sum(Num(1), Num(2)), Num(4)))))

    // эта ошибка будет исправлена в sealed
    println(evalWhenWithLogging(Mul(Num(2),Num(2))))
}