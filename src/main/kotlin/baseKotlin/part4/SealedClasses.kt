package baseKotlin.part4

sealed class Expr(){ // класс по умолчанию открыт
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when(e){
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }

// можно объявлять вложенные классы вне seald класса, но в рамках одного файла
// class Mul(val left: Expr, val right: Expr) : Expr()