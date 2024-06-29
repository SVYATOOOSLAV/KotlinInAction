package baseKotlin.part4.dataAndDelegate

//"""
//свойства, не
//объявленные в основном конструкторе, не принимают участия в проверках
//равенства и вычислении хэш-кода.
//рекомендуется использовать свойства, доступные
//только для чтения, чтобы сделать экземпляры класса неизменяемыми (Например, для HashMap)
//"""

data class Client( val name: String,  val postalCode: Int){
}

fun main(){
    val client1 = Client("Alice", 123)
    val client2 = Client("Alice", 123)
    println(client1)
    println(client1 == client2) // проверяет равенство объектов, а не ссылок как в Java, == конвертируется в equals
    println(client1 === client2) // для сравнения указателей

    val client3 = client1.copy(postalCode = 321)
    println(client3)
}