package baseKotlin.part5.sub5_1

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String){
    // использование статического параметра вне лямбда-выражения, захватыватся лямбда-выражением
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    // обращение к динамическим переменным вне лямбда-выражения, захватыватся лямбда-выражением
    responses.forEach{
        when{
            it.startsWith("4") -> clientErrors++
            it.startsWith("5") -> serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors servers errors")
}

fun main(){
    val messages = listOf("403 Forbidden", "404 Not Found", "401 Not Authorized")
    printMessagesWithPrefix(messages, "Error:")

    val responses = listOf("403 Forbidden", "404 Not Found", "401 Not Authorized",
        "500 Internal Server Errors", "200 OK")
    printProblemCounts(responses)
}