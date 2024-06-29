package baseKotlin.part4.properties

class UserProp(val name: String){
    var address: String = "address"
        set(value: String){
            // логируем
            println("""
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent())
            // присваиваем значение
            field = value
        }
}


fun main(){
    val user = UserProp("Alice")
    user.address = "Munchen"
}