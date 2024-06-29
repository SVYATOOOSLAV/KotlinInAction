package baseKotlin.part5.sub5_1

fun salute() = println("Salute!")
fun sendMessage(person: Person, message: String) = println("${person.name} send message: $message")
fun Person.isAdult() = age >= 21

fun main(){
    // ccылка на член класса
    val getAge = Person::age

    run(::salute)

    // Делегируем работу в sendMessage, 2-ой вариант оптимальный
    val action = { person: Person, message: String ->
        sendMessage(person, message)
    }
    val nextAction = ::sendMessage

    nextAction(Person("Svyat", 19), "Привет")

    // Сохраняем ссылку на функцию расширения
    val predicateAdult = Person::isAdult

    // Связанная ссылка
    val p = Person("Dmitry", 34)
    val dmitryAgeFun = p::age
    println(dmitryAgeFun())
}