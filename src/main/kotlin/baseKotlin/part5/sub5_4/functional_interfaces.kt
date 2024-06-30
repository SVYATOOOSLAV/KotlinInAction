package baseKotlin.part5.sub5_4

fun main() {
    handleComputation("123123")
    createAllDoneRunnable().run()
}

fun handleComputation(id: String) {
    // Если лямбда выражение завхватывает переменные, то компилятор создает новый объект для каждого вызова
    postponeComputation(1000) { println(id) }
}

fun postponeComputation(delay: Int, computation: Runnable) {
    computation.run()
}

fun createAllDoneRunnable(): Runnable {
    // SAM-конструктор (Single Abstract Method) вместо создания аннонимного класса
    return Runnable { println("All Done!") }
/*    return object : Runnable{
        override fun run() {
            println("All done")
            this.newMethod()
        }

        fun newMethod(){
            println(123)
        }
    }*/
}